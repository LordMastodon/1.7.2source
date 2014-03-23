package com.lordmastodon.HiTechMod.block;

import com.lordmastodon.HiTechMod.MainClass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class FaceClass extends Block {

	public FaceClass(Material p_i45394_1_) {
		super(p_i45394_1_);
		
		setCreativeTab(MainClass.HiTechStuff);
		setHardness(5F);
		setResistance(7F);
		setBlockTextureName(MainClass.MODID + ":Face");
	}

}
