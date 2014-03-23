package com.lordmastodon.HiTechMod.titaniumstuff;

import com.lordmastodon.HiTechMod.MainClass;

import net.minecraft.item.ItemAxe;

public class TitaniumAxeClass extends ItemAxe {

	public TitaniumAxeClass(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		
		setCreativeTab(MainClass.HiTechStuff);
		setTextureName(MainClass.MODID + ":TitaniumAxe");
	}

}
