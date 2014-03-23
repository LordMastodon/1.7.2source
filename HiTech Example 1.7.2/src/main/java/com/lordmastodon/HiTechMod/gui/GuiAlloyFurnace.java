package com.lordmastodon.HiTechMod.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import com.lordmastodon.HiTechMod.MainClass;
import com.lordmastodon.HiTechMod.container.ContainerAlloyFurnace;
import com.lordmastodon.HiTechMod.tileentity.TileEntityAlloyFurnace;

public class GuiAlloyFurnace extends GuiContainer {

	public static final ResourceLocation gui = new ResourceLocation(MainClass.MODID, "textures/gui/AlloyFurnaceGui.png");
	
	public TileEntityAlloyFurnace alloyFurnace;
	
	public GuiAlloyFurnace(InventoryPlayer inventoryPlayer, TileEntityAlloyFurnace entity) {
		super(new ContainerAlloyFurnace(inventoryPlayer, entity));
		this.alloyFurnace = entity;
		
		this.xSize = 176;
		this.ySize = 166;
	}
	
	public void drawGuiContainerForegroundLayer(int par1, int par2) {
		//String name = this.alloyFurnace.isInvNameLocalized() ? this.alloyFurnace.getInvName() : I18n.func_135053_a(this.alloyFurnace.getInvName());
		
		//this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
		//this.fontRendererObj.drawString(I18n.this("container.inventory"), 8, this.ySize - 94, 4210752);
	}

	public void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		
	}

}
