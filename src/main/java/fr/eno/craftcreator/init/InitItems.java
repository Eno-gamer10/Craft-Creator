package fr.eno.craftcreator.init;

import fr.eno.craftcreator.References;
import fr.eno.craftcreator.item.ItemBlockBasic;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitItems
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, References.MOD_ID);
	
	public static final RegistryObject<Item> CRAFTING_TABLE_RECIPE_CREATOR = ITEMS.register("crafting_table_recipe_creator", () -> new ItemBlockBasic(InitBlocks.CRAFTING_TABLE_RECIPE_CREATOR.get()));
	public static final RegistryObject<Item> FURNACE_RECIPE_CREATOR = ITEMS.register("furnace_recipe_creator", () -> new ItemBlockBasic(InitBlocks.FURNACE_RECIPE_CREATOR.get()));
	public static final RegistryObject<Item> STONE_CUTTER_RECIPE_CREATOR = ITEMS.register("stone_cutter_recipe_creator", () -> new ItemBlockBasic(InitBlocks.STONE_CUTTER_RECIPE_CREATOR.get()));
	public static final RegistryObject<Item> SMITHING_TABLE_RECIPE_CREATOR = ITEMS.register("smithing_table_recipe_creator", () -> new ItemBlockBasic(InitBlocks.SMITHING_TABLE_RECIPE_CREATOR.get()));
}