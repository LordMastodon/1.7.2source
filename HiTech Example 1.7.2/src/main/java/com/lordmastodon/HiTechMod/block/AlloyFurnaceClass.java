package com.lordmastodon.HiTechMod.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.lordmastodon.HiTechMod.MainClass;
import com.lordmastodon.HiTechMod.tileentity.TileEntityAlloyFurnace;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class AlloyFurnaceClass extends BlockContainer {

	private final boolean isActive;
	
	@SideOnly(Side.CLIENT)
	private IIcon iconFront;
	
	public AlloyFurnaceClass(boolean isActive) {
		super(Material.rock);
		
		setHardness(3.5F);
		setResistance(7F);
		
		this.isActive = isActive;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(MainClass.MODID + ":AlloyFurnaceSide");
		this.iconFront = iconRegister.registerIcon(MainClass.MODID + ":" + (this.isActive ? "AlloyFurnaceActive" : "AlloyFurnaceIdle"));
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata) {
		return side == metadata ? this.iconFront : this.blockIcon;
	}
	
	public Item getItemDropped (int par1, Random random, int par3) {
		return Item.getItemFromBlock(MainClass.AlloyFurnaceIdle);
	}
	
	public void onBlockAdded(World world, int x, int y, int z) {
		super.onBlockAdded(world, x, y, z);
		this.setDefaultDirection(world, x, y, z);
	}
	
	private void setDefaultDirection (World world, int x, int y, int z) {
		if (!world.isRemote) {
			Block block1 = world.getBlock(x, y, z - 1);
			Block block2 = world.getBlock(x, y, z + 1);
			Block block3 = world.getBlock(x - 1, y, z);
			Block block4 = world.getBlock(x + 1, y, z);
			
			byte b0 = 3;
			
			if(block1.func_149730_j() && !block2.func_149730_j()) {
				b0 = 3;
			}
			
			if (block2.func_149730_j() && !block1.func_149730_j()) {
				b0 = 2;
			}
			
			if (block3.func_149730_j() && !block4.func_149730_j()) {
				b0 = 5;
			}
			
			if (block4.func_149730_j() && !block3.func_149730_j()) {
				b0 = 4;
			}
			
			world.setBlockMetadataWithNotify(x, y, z, b0, 2);
		}
		
	}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		if (!world.isRemote) {
			FMLNetworkHandler.openGui(player, MainClass.instance, MainClass.guiIdAlloyFurnace, world, x, y, z);
		}
		
		return true;
	}
	
	public TileEntity createNewTileEntity(World world, int i) {
		return new TileEntityAlloyFurnace();
	}

	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLivingBase, ItemStack itemstack) {
		int l = MathHelper.floor_double((double)(entityLivingBase.rotationYaw * 4.0F / 360F) + 0.5D) & 3;
		
		if (l == 0) {
			world.setBlockMetadataWithNotify(x, y, z, 2, 2);
		}
		
		if (l == 1) {
			world.setBlockMetadataWithNotify(x, y, z, 5, 2);
		}
		
		if (l == 2) {
			world.setBlockMetadataWithNotify(x, y, z, 3, 2);
		}
		
		if (l == 3) {
			world.setBlockMetadataWithNotify(x, y, z, 4, 2);
		}
		
		if(itemstack.hasDisplayName()) {
			((TileEntityAlloyFurnace)world.getTileEntity(x, y, z)).setGuiDisplayName(itemstack.getDisplayName());
		}
	}

}
