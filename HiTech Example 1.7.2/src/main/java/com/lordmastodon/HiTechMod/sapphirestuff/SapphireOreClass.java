package com.lordmastodon.HiTechMod.sapphirestuff;

import com.lordmastodon.HiTechMod.MainClass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SapphireOreClass extends Block {

	public SapphireOreClass(Material p_i45394_1_) {
		super(p_i45394_1_);
		
		setCreativeTab(MainClass.HiTechStuff);
		setHardness(5F);
		setResistance(7F);
		setBlockTextureName(MainClass.MODID + ":SapphireOre");
	}

}
