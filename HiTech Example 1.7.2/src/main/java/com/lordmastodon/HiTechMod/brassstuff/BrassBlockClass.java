package com.lordmastodon.HiTechMod.brassstuff;

import com.lordmastodon.HiTechMod.MainClass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BrassBlockClass extends Block {

	public BrassBlockClass(Material arg0) {
		super(arg0);
		
		setCreativeTab(MainClass.HiTechStuff);
		setHardness(5F);
		setResistance(7F);
		setBlockTextureName(MainClass.MODID + ":BrassBlock");
	}

}
