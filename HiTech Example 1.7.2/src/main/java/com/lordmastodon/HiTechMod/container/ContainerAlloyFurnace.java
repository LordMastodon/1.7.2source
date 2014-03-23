package com.lordmastodon.HiTechMod.container;

import com.lordmastodon.HiTechMod.tileentity.TileEntityAlloyFurnace;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerAlloyFurnace extends Container {

	public ContainerAlloyFurnace(InventoryPlayer inventoryPlayer,
			TileEntityAlloyFurnace entity) {
	}

	public boolean canInteractWith(EntityPlayer var1) {
		return false;
	}

}
