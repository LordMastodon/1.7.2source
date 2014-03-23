package com.lordmastodon.HiTechMod.creativetabs;

import com.lordmastodon.HiTechMod.MainClass;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class HiTechStuff extends CreativeTabs {

	public HiTechStuff(int par1, String par2Str) {
		super(par1, par2Str);
	}

	public Item getTabIconItem() {
		return MainClass.TitaniumIngot;
	}

}
