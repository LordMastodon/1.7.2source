package com.lordmastodon.HiTechMod.copperstuff;

import com.lordmastodon.HiTechMod.MainClass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CopperOreClass extends Block {

	public CopperOreClass(Material arg0) {
		super(arg0);
		
		setCreativeTab(MainClass.HiTechStuff);
		setHardness(3F);
		setResistance(5.0F);
		setBlockTextureName(MainClass.MODID + ":CopperOre");
	}

}
