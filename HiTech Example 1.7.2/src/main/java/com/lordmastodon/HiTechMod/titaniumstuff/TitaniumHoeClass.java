package com.lordmastodon.HiTechMod.titaniumstuff;

import com.lordmastodon.HiTechMod.MainClass;

import net.minecraft.item.ItemHoe;

public class TitaniumHoeClass extends ItemHoe {

	public TitaniumHoeClass(ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
		
		setCreativeTab(MainClass.HiTechStuff);
		setTextureName(MainClass.MODID + ":TitaniumHoe");
	}

}
