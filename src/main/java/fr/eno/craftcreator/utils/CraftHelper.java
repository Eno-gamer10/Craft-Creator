package fr.eno.craftcreator.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fr.eno.craftcreator.serializer.CraftingTableRecipeSerializer;
import fr.eno.craftcreator.serializer.FurnaceRecipeSerializer;
import fr.eno.craftcreator.serializer.SmithingTableRecipeSerializer;
import fr.eno.craftcreator.serializer.StoneCutterRecipeSerializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class CraftHelper
{
	public static void createFurnaceRecipe(NonNullList<ItemStack> inventory, CraftType type, String exp, String cookTime)
	{
		Item input = inventory.get(0).getItem();
		Item output = inventory.get(1).getItem();
		
		FurnaceRecipeSerializer recipe = FurnaceRecipeSerializer.create(type, output);

		try { recipe.setExperience(Double.valueOf(exp)); } catch(Exception e) {}
		try { recipe.setCookingTime(Integer.valueOf(cookTime)); } catch(Exception e) {}
		
		recipe.setIngredient(input);
		
		recipe.serializeRecipe();
	}
	
	public static void createSmithingTableRecipe(NonNullList<ItemStack> inventory)
	{
		ItemStack output = inventory.get(2);
		List<Item> input = Arrays.asList(inventory.get(0).getItem(), inventory.get(1).getItem());
		
		SmithingTableRecipeSerializer.create(output.getItem()).setIngredient(input).serializeRecipe();
	}
	
	public static void createStoneCutterRecipe(NonNullList<ItemStack> inventory)
	{
		ItemStack output = inventory.get(0);
		Item input = inventory.get(1).getItem();
		
		StoneCutterRecipeSerializer.create(output.getItem(), output.getCount()).setIngredient(input).serializeRecipe();
	}
	
	public static void createCraftingTableRecipe(NonNullList<ItemStack> inventory, boolean isShaped)
	{
		ItemStack output = inventory.get(9);
		
		CraftingTableRecipeSerializer recipe = CraftingTableRecipeSerializer.create(isShaped ? CraftType.CRAFTING_TABLE_SHAPED : CraftType.CRAFTING_TABLE_SHAPELESS, output.getItem(), output.getCount());
		
		List<Item> ingredients = new ArrayList<>();
		
		for (int i = 0; i < 9; i++)
			ingredients.add(inventory.get(i).getItem());
		
		recipe.setIngredients(ingredients);
		
		recipe.serializeRecipe();
	}
}
