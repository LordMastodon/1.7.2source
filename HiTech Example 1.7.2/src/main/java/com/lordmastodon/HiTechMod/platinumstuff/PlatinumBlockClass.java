package com.lordmastodon.HiTechMod.platinumstuff;

import com.lordmastodon.HiTechMod.MainClass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PlatinumBlockClass extends Block {

	public PlatinumBlockClass(Material p_i45394_1_) {
		super(p_i45394_1_);
		
		setCreativeTab(MainClass.HiTechStuff);
		setHardness(5F);
		setResistance(7.0F);
		setBlockTextureName(MainClass.MODID + ":PlatinumBlock");
	}

}
