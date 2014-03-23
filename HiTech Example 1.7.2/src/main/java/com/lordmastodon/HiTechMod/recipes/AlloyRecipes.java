package com.lordmastodon.HiTechMod.recipes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.item.ItemStack;

import com.lordmastodon.HiTechMod.MainClass;
import com.lordmastodon.HiTechMod.tileentity.TileEntityAlloyFurnace;

public class AlloyRecipes {
	
	TileEntityAlloyFurnace TEAF;

	private static final AlloyRecipes smeltingBase = new AlloyRecipes(null);
	
	private Map smeltingList = new HashMap();
	private Map experienceList = new HashMap();
    private HashMap<List<Integer>, ItemStack> metaSmeltingList = new HashMap<List<Integer>, ItemStack>();
    private HashMap<List<Integer>, Float> metaExperience = new HashMap<List<Integer>, Float>();
    
    public static final AlloyRecipes smelting() {
        return smeltingBase;
    }
    
    public Map getSmeltingList() {
        return this.smeltingList;
    }
    
    @Deprecated
    public ItemStack getSmeltingResult(int par1) {
        return (ItemStack)this.smeltingList.get(Integer.valueOf(par1));
    }
    
    public ItemStack getSmeltingResult(ItemStack item) 
    {
        if (item == null) {
            return null;
        }
        ItemStack ret = (ItemStack)metaSmeltingList.get(Arrays.asList(item.g, item.getItemDamage()));
        if (ret != null) 
        {
            return ret;
        }
        return (ItemStack)smeltingList.get(Integer.valueOf(item.getI));
    }
    
    private ItemStack PewterRecipe(ItemStack is) {
    	if(TEAF.slots[0] == MainClass.TinIngot.getContainerItem(is) && TEAF.slots[1] == MainClass.CopperIngot.getContainerItem(is)) {
    		return MainClass.PewterIngot.getContainerItem(is);
    	} else {
    		return null;
    	}
    }
    
    private ItemStack PewterRecipe2(ItemStack is) {
    	if(TEAF.slots[0] == MainClass.CopperIngot.getContainerItem(is) && TEAF.slots[1] == MainClass.TinIngot.getContainerItem(is)) {
    		return MainClass.PewterIngot.getContainerItem(is);
    	} else {
    		return null;
    	}
    }
    
    private ItemStack BrassRecipe(ItemStack is) {
    	if(TEAF.slots[0] == MainClass.)
    }
    
    private ItemStack BronzeRecipe(ItemStack is) {
    	if(TEAF.slots[0] == MainClass.AluminumIngot.getContainerItem(is) && TEAF.slots[1] == MainClass.TinIngot.getContainerItem(is)) {
    		return MainClass.BronzeIngot.getContainerItem(is);
    	} else {
    		return null;
    	}
    }
    
    private ItemStack BronzeRecipe2(ItemStack is) {
    	if(TEAF.slots[1] == MainClass.AluminumIngot.getContainerItem(is) && TEAF.slots[0] == MainClass.TinIngot.getContainerItem(is)) {
    		return MainClass.BronzeIngot.getContainerItem(is);
    	} else {
    		return null;
    	}
    }
    
    private AlloyRecipes(ItemStack is) {
    	this.smeltingList.put(this.PewterRecipe(is), is);
    	this.smeltingList.put(this.PewterRecipe2(is), is);
    	this.smeltingList.put(this.BronzeRecipe(is), is);
    	this.smeltingList.put(this.BronzeRecipe2(is), is);
;    }
    
}
