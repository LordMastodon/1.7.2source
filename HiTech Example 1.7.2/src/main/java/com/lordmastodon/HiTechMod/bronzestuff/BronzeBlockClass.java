package com.lordmastodon.HiTechMod.bronzestuff;

import com.lordmastodon.HiTechMod.MainClass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BronzeBlockClass extends Block {

	public BronzeBlockClass(Material p_i45394_1_) {
		super(p_i45394_1_);
		
		setCreativeTab(MainClass.HiTechStuff);
		setHardness(5F);
		setResistance(7F);
		setBlockTextureName(MainClass.MODID + ":BronzeBlock");
	}

}
