package com.lordmastodon.HiTechMod.titaniumstuff;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.lordmastodon.HiTechMod.MainClass;

public class TitaniumBlockClass extends Block {

	public TitaniumBlockClass(Material arg1) {
		super(arg1);
		
		setCreativeTab(MainClass.HiTechStuff);
		setHardness(5F);
		setResistance(7.0F);
		setBlockTextureName(MainClass.MODID + ":TitaniumBlock");
	}
	
}