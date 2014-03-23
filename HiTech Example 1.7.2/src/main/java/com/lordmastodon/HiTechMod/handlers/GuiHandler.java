package com.lordmastodon.HiTechMod.handlers;

import com.lordmastodon.HiTechMod.MainClass;
import com.lordmastodon.HiTechMod.container.ContainerAlloyFurnace;
import com.lordmastodon.HiTechMod.gui.GuiAlloyFurnace;
import com.lordmastodon.HiTechMod.tileentity.TileEntityAlloyFurnace;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
	
		if(entity != null) {
			switch(ID) {
				case MainClass.guiIdAlloyFurnace:
					if(entity instanceof TileEntityAlloyFurnace) {
						return new GuiAlloyFurnace(player.inventory, (TileEntityAlloyFurnace) entity);
					}
			}
		}
		
		return null;
	}

	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null) {
			switch(ID) {
				case MainClass.guiIdAlloyFurnace:
					if(entity instanceof TileEntityAlloyFurnace) {
						return new ContainerAlloyFurnace(player.inventory, (TileEntityAlloyFurnace) entity);
					}
			}
		}
		
		return null;
	}

}
