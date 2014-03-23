package com.lordmastodon.HiTechMod.titaniumstuff;

import com.lordmastodon.HiTechMod.MainClass;

import net.minecraft.item.ItemSword;

public class TitaniumSwordClass extends ItemSword {

	public TitaniumSwordClass(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		
		setCreativeTab(MainClass.HiTechStuff);
		setTextureName(MainClass.MODID + ":TitaniumSword");
	}

}
