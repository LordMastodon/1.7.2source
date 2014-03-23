package com.lordmastodon.HiTechMod.titaniumstuff;

import com.lordmastodon.HiTechMod.MainClass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TitaniumOreClass extends Block {

	public TitaniumOreClass(Material arg0) {
		super(arg0);
		
		setCreativeTab(MainClass.HiTechStuff);
		setHardness(5F);
		setResistance(7.0F);
		setBlockTextureName(MainClass.MODID + ":TitaniumOre");
	}

}
