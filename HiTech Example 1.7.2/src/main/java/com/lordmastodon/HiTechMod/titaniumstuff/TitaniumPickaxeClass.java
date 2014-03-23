package com.lordmastodon.HiTechMod.titaniumstuff;

import com.lordmastodon.HiTechMod.MainClass;

import net.minecraft.item.ItemPickaxe;

public class TitaniumPickaxeClass extends ItemPickaxe {

	public TitaniumPickaxeClass(ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
		
		setCreativeTab(MainClass.HiTechStuff);
		setTextureName(MainClass.MODID + "TitaniumPickaxe");
	}

}
