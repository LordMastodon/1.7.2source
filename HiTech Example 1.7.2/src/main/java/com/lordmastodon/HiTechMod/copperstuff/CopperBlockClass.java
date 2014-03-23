package com.lordmastodon.HiTechMod.copperstuff;

import com.lordmastodon.HiTechMod.MainClass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CopperBlockClass extends Block {

	public CopperBlockClass(Material argf) {
		super(argf);
		
		setCreativeTab(MainClass.HiTechStuff);
		setHardness(5F);
		setResistance(7.0F);
		setBlockTextureName(MainClass.MODID + ":CopperBlock");
	}

}
