package com.lordmastodon.HiTechMod.rubystuff;

import com.lordmastodon.HiTechMod.MainClass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RubyOreClass extends Block {

	public RubyOreClass(Material arg0) {
		super(arg0);
		
		setCreativeTab(MainClass.HiTechStuff);
		setHardness(5F);
		setResistance(7F);
		setBlockTextureName(MainClass.MODID + ":RubyOre");
	}

}
