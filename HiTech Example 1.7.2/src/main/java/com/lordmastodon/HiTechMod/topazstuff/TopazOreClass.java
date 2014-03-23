package com.lordmastodon.HiTechMod.topazstuff;

import com.lordmastodon.HiTechMod.MainClass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TopazOreClass extends Block {

	public TopazOreClass(Material arg0) {
		super(arg0);
		
		setCreativeTab(MainClass.HiTechStuff);
		setHardness(5F);
		setResistance(7F);
		setBlockTextureName(MainClass.MODID + ":TopazOre");
	}

}
