package fr.eno.craftcreator.serializer;

import java.util.List;

import com.google.gson.JsonObject;

import fr.eno.craftcreator.utils.CraftType;
import net.minecraft.item.Item;
import net.minecraft.util.IItemProvider;

public class SmithingTableRecipeSerializer extends RecipeSerializer
{
	private SmithingTableRecipeSerializer(IItemProvider output)
	{
		super(CraftType.STONECUTTING, output);
		this.setOutput(output);
	}

	public SmithingTableRecipeSerializer setIngredient(List<Item> list)
	{
		JsonObject base = new JsonObject();
		base.addProperty("item", list.get(0).getRegistryName().toString());
		
		JsonObject addition = new JsonObject();
		addition.addProperty("item", list.get(1).getRegistryName().toString());
		
		recipe.add("base", base);
		recipe.add("addition", addition);
		return this;
	}

	private SmithingTableRecipeSerializer setOutput(IItemProvider output)
	{
		JsonObject result = new JsonObject();
		result.addProperty("item", output.asItem().getRegistryName().toString());
		recipe.add("result", result);
		return this;
	}

	public static SmithingTableRecipeSerializer create(IItemProvider output)
	{
		return new SmithingTableRecipeSerializer(output);
	}
}