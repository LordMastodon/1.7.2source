package com.lordmastodon.HiTechMod.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntity;

import com.lordmastodon.HiTechMod.block.AlloyFurnaceClass;
import com.lordmastodon.HiTechMod.recipes.AlloyRecipes;

import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntityAlloyFurnace extends TileEntity implements ISidedInventory {

	private String localizedName;
	
	AlloyRecipes AR;
	
	private static final int[] slots_top = new int[]{0, 1};
	private static final int[] slots_bottom = new int[]{3, 2};
	private static final int[] slots_sides = new int[]{2};

	public int furnaceSpeed = 200;	
	public int burnTime;
	public int currentItemBurnTime;
	public int cookTime;
	
	public ItemStack[] slots = new ItemStack[4];
	
	public int getSizeInventory() {
		return this.slots.length;
	}
	
	public void setGuiDisplayName(String displayName) {
		this.localizedName = displayName;
	}

	public boolean isInvNameLocalized() {
		return this.localizedName != null && this.localizedName.length() > 0;
	}

	public String getInvName() {
		return this.isInvNameLocalized() ? this.localizedName : "container.AlloyFurnace";
	}

	public void closeInventory() {
		
	}

	public ItemStack decrStackSize(int arg0, int arg1) {
		return null;
	}

	public String getInventoryName() {
		return null;
	}

	public int getInventoryStackLimit() {
		return 0;
	}

	public ItemStack getStackInSlot(int var1) {
		return null;
	}

	public ItemStack getStackInSlotOnClosing(int var1) {
		return null;
	}

	public boolean hasCustomInventoryName() {
		return false;
	}
	
	public boolean isBurning() {
		return this.isBurning();
	}
	
	public void updateEntity() {
		boolean flag = this.isBurning();
		boolean flag1 = false;
		
		if(this.isBurning()) {
			this.burnTime--;
		}
		
		if (!this.worldObj.isRemote) {
			if (this.burnTime == 0 && this.canSmelt()) {
				this.currentItemBurnTime = this.burnTime = getItemBurnTime(this.slots[2]);
				
				if(this.isBurning()) {
					flag1 = true;
					
					if(this.slots[2] != null) {
						this.slots[2].stackSize--;
						
						if(this.slots[2].stackSize == 0) {
							this.slots[2] = this.slots[2].getItem().getContainerItem(this.slots[2]);
						}
					}
				}
			}
			
			if(this.isBurning() && this.canSmelt()) {
				this.cookTime++;
				
				if(this.cookTime == this.furnaceSpeed) {
					this.cookTime = 0;
					this.smeltItem();
					flag1 = true;
				}
				
			} else {
				this.cookTime = 0;
			}
			
			if(flag != this.isBurning()) {
				flag1 = true;
				AlloyFurnaceClass.updateAlloyFurnaceBlockState(this.isBurning(), this.worldObj, this.xCoord, this.yCoord, this.zCoord);
			}
		}
		
		if(flag1) {
			this.onInventoryChanged();
		}
		
	}
	
	private boolean canSmelt(ItemStack is) {
		if(this.slots[0] == null && this.slots[1] == null) {
			return false;
		} else {
			ItemStack itemstack = AlloyRecipes.smelting().g
		}
	}
	
	public static int getItemBurnTime(ItemStack itemstack) {
		if (itemstack == null) {
			return 200;
		} else {
			return GameRegistry.getFuelValue(itemstack);
		}
	}

	public static boolean isItemFuel(ItemStack itemstack) {
		return getItemBurnTime(itemstack) > 0;
	}

	public boolean isItemValidForSlot(int var1, ItemStack var2) {
		return var1 == 3 ? false : (var1 == 2 ? isItemFuel(var2) : true);
	}

	public boolean isUseableByPlayer(EntityPlayer var1) {
		return false;
	}

	public void openInventory() {
		
	}

	public void setInventorySlotContents(int var1, ItemStack var2) {
		
	}

	public boolean canExtractItem(int var1, ItemStack var2, int var3) {
		//Delete me once you find the solution to the line below return false.
		return false;
		
		//return var3 != 0 || var1 != 1 || var2 == Items.bucket;
	}

	public boolean canInsertItem(int var1, ItemStack var2, int var3) {
		return this.isItemValidForSlot(var1, var2);
	}

	public int[] getAccessibleSlotsFromSide(int var1) {
		return var1 == 0 ? this.slots_bottom : (var1 == 1 ? this.slots_top : this.slots_sides);
	}

}
