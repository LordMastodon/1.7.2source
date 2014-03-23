package com.lordmastodon.HiTechMod.aluminumstuff;

import com.lordmastodon.HiTechMod.MainClass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.crafting.FurnaceRecipes;

public class AluminumBlockClass extends Block {

	public AluminumBlockClass(Material p_i45394_1_) {
		super(p_i45394_1_);
		
		setCreativeTab(MainClass.HiTechStuff);
		setHardness(5F);
		setResistance(7F);
		setBlockTextureName(MainClass.MODID + ":AluminumBlock");
	}

}
