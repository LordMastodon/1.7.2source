package com.lordmastodon.HiTechMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

import com.lordmastodon.HiTechMod.aluminumstuff.AluminumBlockClass;
import com.lordmastodon.HiTechMod.aluminumstuff.AluminumIngotClass;
import com.lordmastodon.HiTechMod.aluminumstuff.AluminumOreClass;
import com.lordmastodon.HiTechMod.amethyststuff.AmethystClass;
import com.lordmastodon.HiTechMod.amethyststuff.AmethystOreClass;
import com.lordmastodon.HiTechMod.block.AlloyFurnaceClass;
import com.lordmastodon.HiTechMod.block.FaceClass;
import com.lordmastodon.HiTechMod.brassstuff.BrassBlockClass;
import com.lordmastodon.HiTechMod.brassstuff.BrassIngotClass;
import com.lordmastodon.HiTechMod.bronzestuff.BronzeBlockClass;
import com.lordmastodon.HiTechMod.bronzestuff.BronzeIngotClass;
import com.lordmastodon.HiTechMod.copperstuff.CopperBlockClass;
import com.lordmastodon.HiTechMod.copperstuff.CopperOreClass;
import com.lordmastodon.HiTechMod.creativetabs.HiTechStuff;
import com.lordmastodon.HiTechMod.genericitem.BatteryClass;
import com.lordmastodon.HiTechMod.genericitem.CopperIngotClass;
import com.lordmastodon.HiTechMod.genericitem.ElectricityStickClass;
import com.lordmastodon.HiTechMod.handlers.GuiHandler;
import com.lordmastodon.HiTechMod.pewterstuff.PewterBlockClass;
import com.lordmastodon.HiTechMod.pewterstuff.PewterIngotClass;
import com.lordmastodon.HiTechMod.platinumstuff.PlatinumBlockClass;
import com.lordmastodon.HiTechMod.platinumstuff.PlatinumIngotClass;
import com.lordmastodon.HiTechMod.platinumstuff.PlatinumOreClass;
import com.lordmastodon.HiTechMod.rubystuff.RubyClass;
import com.lordmastodon.HiTechMod.rubystuff.RubyOreClass;
import com.lordmastodon.HiTechMod.sapphirestuff.SapphireClass;
import com.lordmastodon.HiTechMod.sapphirestuff.SapphireOreClass;
import com.lordmastodon.HiTechMod.silverstuff.SilverBlockClass;
import com.lordmastodon.HiTechMod.silverstuff.SilverIngotClass;
import com.lordmastodon.HiTechMod.silverstuff.SilverOreClass;
import com.lordmastodon.HiTechMod.tileentity.TileEntityAlloyFurnace;
import com.lordmastodon.HiTechMod.tinstuff.TinIngotClass;
import com.lordmastodon.HiTechMod.tinstuff.TinOreClass;
import com.lordmastodon.HiTechMod.titaniumstuff.TitaniumAxeClass;
import com.lordmastodon.HiTechMod.titaniumstuff.TitaniumBlockClass;
import com.lordmastodon.HiTechMod.titaniumstuff.TitaniumHoeClass;
import com.lordmastodon.HiTechMod.titaniumstuff.TitaniumIngotClass;
import com.lordmastodon.HiTechMod.titaniumstuff.TitaniumOreClass;
import com.lordmastodon.HiTechMod.titaniumstuff.TitaniumPickaxeClass;
import com.lordmastodon.HiTechMod.titaniumstuff.TitaniumShovelClass;
import com.lordmastodon.HiTechMod.titaniumstuff.TitaniumSwordClass;
import com.lordmastodon.HiTechMod.topazstuff.TopazClass;
import com.lordmastodon.HiTechMod.topazstuff.TopazOreClass;
import com.lordmastodon.HiTechMod.zincstuff.ZincIngotClass;
import com.lordmastodon.HiTechMod.zincstuff.ZincOreClass;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = MainClass.MODID, name = MainClass.NAME, version = MainClass.VERSION)
public class MainClass {
	@SidedProxy(clientSide = "com.lordmastodon.HiTechMod.ClientProxy", serverSide = "com.lordmastodon.HiTechMod.CommonProxy")
	public static CommonProxy proxy;
	
	//Mod Info
	public static final String MODID = "hitech";
	public static final String NAME = "LordMastodon's HiTech Mod!";
	public static final String VERSION = "Beta v1.00";
	
	//Instance
	@Instance(MODID)
	public static MainClass instance;
	
	//Creative Tabs
	public static CreativeTabs HiTechStuff = new HiTechStuff(CreativeTabs.getNextID(), "HiTechStuff");
	
	//Armor Materials
	
	//Titanium Armor
	
	//Silver Armor
	
	//Copper Armor
	
	//Platinum Armor
	
	//Tool Material Registry
	public static ToolMaterial TitaniumMaterial = EnumHelper.addToolMaterial("TitaniumMaterial", 3, 900, 9.0F, 9.0F, 30);
	
	//Normal Titanium Tool Registry
	public static Item TitaniumAxe = new TitaniumAxeClass(TitaniumMaterial).setUnlocalizedName("TitaniumAxe");
	public static Item TitaniumHoe = new TitaniumHoeClass(TitaniumMaterial).setUnlocalizedName("TitaniumHoe");
	public static Item TitaniumShovel = new TitaniumShovelClass(TitaniumMaterial).setUnlocalizedName("TitaniumShovel");
	public static Item TitaniumPickaxe = new TitaniumPickaxeClass(TitaniumMaterial).setUnlocalizedName("TitaniumPickaxe");
	public static Item TitaniumSword = new TitaniumSwordClass(TitaniumMaterial).setUnlocalizedName("TitaniumSword");
	
	//Silver Tool Registry
	
	//Platinum Tool Registry
	
	//Copper Tool Registry
	
	//Block Registry
	public static Block TitaniumOre = new TitaniumOreClass(Material.rock).setBlockName("TitaniumOre");
	public static Block TitaniumBlock = new TitaniumBlockClass(Material.iron).setBlockName("TitaniumBlock");
	public static Block CopperOre = new CopperOreClass(Material.rock).setBlockName("CopperOre");
	public static Block CopperBlock = new CopperBlockClass(Material.iron).setBlockName("CopperBlock");
	public static Block SilverOre = new SilverOreClass(Material.rock).setBlockName("SilverOre");
	public static Block SilverBlock = new SilverBlockClass(Material.iron).setBlockName("SilverBlock");
	public static Block PlatinumOre = new PlatinumOreClass(Material.rock).setBlockName("PlatinumOre");
	public static Block PlatinumBlock = new PlatinumBlockClass(Material.iron).setBlockName("PlatinumBlock");
	public static Block RubyOre = new RubyOreClass(Material.rock).setBlockName("RubyOre");
	public static Block SapphireOre = new SapphireOreClass(Material.rock).setBlockName("SapphireOre");
	public static Block TopazOre = new TopazOreClass(Material.rock).setBlockName("TopazOre");
	public static Block AmethystOre = new AmethystOreClass(Material.rock).setBlockName("AmethystOre");
	public static Block PewterBlock = new PewterBlockClass(Material.iron).setBlockName("PewterBlock");
	public static Block BronzeBlock = new BronzeBlockClass(Material.iron).setBlockName("BronzeBlock");
	public static Block BrassBlock = new BrassBlockClass(Material.iron).setBlockName("BrassBlock");
	public static Block TinOre = new TinOreClass(Material.rock).setBlockName("TinBlock");
	public static Block ZincOre = new ZincOreClass(Material.rock).setBlockName("ZincOre");
	public static Block Face = new FaceClass(Material.ground).setBlockName("Face");
	public static Block AluminumOre = new AluminumOreClass(Material.ground).setBlockName("AluminumOre");
	public static Block AluminumBlock = new AluminumBlockClass(Material.iron).setBlockName("AluminumBlock");
	
	//Alloy Furnace
	public static Block AlloyFurnaceIdle = new AlloyFurnaceClass(false).setBlockName("AlloyFurnaceIdle").setCreativeTab(HiTechStuff);
	public static Block AlloyFurnaceActive = new AlloyFurnaceClass(true).setBlockName("AlloyFurnaceActive").setLightLevel(1.0F);
	
	//Item Registry
	public static Item TitaniumIngot = new TitaniumIngotClass().setUnlocalizedName("TitaniumIngot");
	public static Item CopperIngot = new CopperIngotClass().setUnlocalizedName("CopperIngot");
	public static Item ElectricityStick = new ElectricityStickClass().setUnlocalizedName("ElectricityStick");
	public static Item Battery = new BatteryClass().setUnlocalizedName("Battery");
	public static Item SilverIngot = new SilverIngotClass().setUnlocalizedName("SilverIngot");
	public static Item PlatinumIngot = new PlatinumIngotClass().setUnlocalizedName("PlatinumIngot");
	public static Item Ruby = new RubyClass().setUnlocalizedName("Ruby");
	public static Item Sapphire = new SapphireClass().setUnlocalizedName("Sapphire");
	public static Item Topaz = new TopazClass().setUnlocalizedName("Topaz");
	public static Item Amethyst = new AmethystClass().setUnlocalizedName("Amethyst");
	public static Item PewterIngot = new PewterIngotClass().setUnlocalizedName("PewterIngot");
	public static Item BronzeIngot = new BronzeIngotClass().setUnlocalizedName("BronzeIngot");
	public static Item BrassIngot = new BrassIngotClass().setUnlocalizedName("BrassIngot");
	public static Item TinIngot = new TinIngotClass().setUnlocalizedName("TinIngot");
	public static Item ZincIngot = new ZincIngotClass().setUnlocalizedName("ZincIngot");
	public static Item AluminumIngot = new AluminumIngotClass().setUnlocalizedName("AluminumIngot");
	
	//GUI Ids
	public static final int guiIdAlloyFurnace = 0;
	
	@EventHandler
	public void load(FMLPreInitializationEvent e) {
		
		//Handler Registery
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		
		//Registering Blocks
		GameRegistry.registerBlock(TitaniumOre, "TitaniumOre");
		GameRegistry.registerBlock(TitaniumBlock, "TitaniumBlock");
		GameRegistry.registerBlock(CopperBlock, "CopperBlock");
		GameRegistry.registerBlock(CopperOre, "CopperOre");
		GameRegistry.registerBlock(PlatinumBlock, "PlatinumBlock");
		GameRegistry.registerBlock(PlatinumOre, "PlatinumOre");
		GameRegistry.registerBlock(SilverBlock, "SilverBlock");
		GameRegistry.registerBlock(SilverOre, "SilverOre");
		GameRegistry.registerBlock(AlloyFurnaceIdle, "AlloyFurnaceIdle");
		GameRegistry.registerBlock(AlloyFurnaceActive, "AlloyFurnaceActive");
		GameRegistry.registerBlock(Face, "Face");
		GameRegistry.registerBlock(PewterBlock, "PewterBlock");
		GameRegistry.registerBlock(BronzeBlock, "BronzeBlock");
		GameRegistry.registerBlock(AmethystOre, "AmethystOre");
		GameRegistry.registerBlock(RubyOre, "RubyOre");
		GameRegistry.registerBlock(SapphireOre, "SapphireOre");
		GameRegistry.registerBlock(TopazOre, "TopazOre");
		GameRegistry.registerBlock(BrassBlock, "BrassBlock");
		GameRegistry.registerBlock(TinOre, "TinOre");
		GameRegistry.registerBlock(ZincOre, "ZincOre");
		GameRegistry.registerBlock(AluminumBlock, "AluminumBlock");
		GameRegistry.registerBlock(AluminumOre, "AluminumOre");
		
		//Registering Items
		GameRegistry.registerItem(TitaniumIngot, "TitaniumIngot");
		GameRegistry.registerItem(CopperIngot, "CopperIngot");
		GameRegistry.registerItem(Battery, "Battery");
		GameRegistry.registerItem(ElectricityStick, "ElectricityStick");
		GameRegistry.registerItem(PlatinumIngot, "PlatinumIngot");
		GameRegistry.registerItem(SilverIngot, "SilverIngot");
		GameRegistry.registerItem(Ruby, "Ruby");
		GameRegistry.registerItem(Amethyst, "Amethyst");
		GameRegistry.registerItem(BrassIngot, "BrassIngot");
		GameRegistry.registerItem(BronzeIngot, "BronzeIngot");
		GameRegistry.registerItem(ZincIngot, "ZincIngot");
		GameRegistry.registerItem(PewterIngot, "PewterIngot");
		GameRegistry.registerItem(Sapphire, "Sapphire");
		GameRegistry.registerItem(TinIngot, "TinIngot");
		GameRegistry.registerItem(Topaz, "Topaz");
		GameRegistry.registerItem(AluminumIngot, "AluminumIngot");
		
		//Registering Titanium Toolset
		GameRegistry.registerItem(TitaniumAxe, "TitaniumAxe");
		GameRegistry.registerItem(TitaniumHoe, "TitaniumHoe");
		GameRegistry.registerItem(TitaniumPickaxe, "TitaniumPickaxe");
		GameRegistry.registerItem(TitaniumShovel, "TitaniumShovel");
		GameRegistry.registerItem(TitaniumSword, "TitaniumSword");
		
		//Registering Silver Toolset
		
		//Registering Platium Toolset
		
		//Registering Copper Toolset
		
		//Registering Silver Armorset
		
		//Registering Platinum Armorset
		
		//Registering Copper Armorset

		//Normal Titanium Toolset Crafting Recipes
		GameRegistry.addRecipe(new ItemStack(TitaniumAxe, 1), new Object[] {"aa ", "ab ", " b ", 'a', TitaniumIngot, 'b', Item.itemRegistry.getObject("stick")});
		GameRegistry.addRecipe(new ItemStack(TitaniumHoe, 1), new Object[] {"aa ", " b ", " b ", 'a', TitaniumIngot, 'b', Item.itemRegistry.getObject("stick")});
		GameRegistry.addRecipe(new ItemStack(TitaniumPickaxe, 1), new Object[] {"aaa", " b ", " b ", 'a', TitaniumIngot, 'b', Item.itemRegistry.getObject("stick")});
		GameRegistry.addRecipe(new ItemStack(TitaniumShovel, 1), new Object[] {" a ", "ab ", " b ", 'a', TitaniumIngot, 'b', Item.itemRegistry.getObject("stick")});
		GameRegistry.addRecipe(new ItemStack(TitaniumSword, 1), new Object[] {" a ", " a ", " b ", 'a', TitaniumIngot, 'b', Item.itemRegistry.getObject("stick")});
		
		//Generic Crafting Recipes
		GameRegistry.addRecipe(new ItemStack(Battery, 1), new Object[] {"III", "ICI", "III", 'I', Item.itemRegistry.getObject("iron_ingot"), 'C', CopperIngot});
		GameRegistry.addShapelessRecipe(new ItemStack(ElectricityStick, 2), CopperIngot);
		
		//Smelting Recipes
		
		//TileEntity Registry
		GameRegistry.registerTileEntity(TileEntityAlloyFurnace.class, "TileEntityAlloyFurnace");
		
		//I don't know
		LanguageRegistry.instance().addStringLocalization("container.AlloyFurnace", "Alloy Furnace");
		
	}

}