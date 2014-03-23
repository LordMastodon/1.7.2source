package com.lordmastodon.HiTechMod.pewterstuff;

import com.lordmastodon.HiTechMod.MainClass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PewterBlockClass extends Block {

	public PewterBlockClass(Material p_i45394_1_) {
		super(p_i45394_1_);
	
		setCreativeTab(MainClass.HiTechStuff);
		setHardness(4F);
		setResistance(7F);
		setBlockTextureName(MainClass.MODID + ":PewterBlock");
	}

}
