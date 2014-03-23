package com.lordmastodon.HiTechMod.titaniumstuff;

import com.lordmastodon.HiTechMod.MainClass;

import net.minecraft.item.ItemSpade;

public class TitaniumShovelClass extends ItemSpade {

	public TitaniumShovelClass(ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		
		setCreativeTab(MainClass.HiTechStuff);
		setTextureName(MainClass.MODID + ":TitaniumShovel");
	}

}
