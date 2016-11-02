package com.gods.mobrecipes.recipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addShapedRecipe(new ItemStack(Items.BLAZE_ROD), "RC", 'R', new ItemStack(Items.DYE, 1, 1), 'C', new ItemStack(Items.COAL, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack(Items.STRING), "W", 'W', Blocks.WOOL);
		GameRegistry.addShapedRecipe(new ItemStack(Items.SPIDER_EYE), "N", 'N', Items.NETHER_WART);
		GameRegistry.addShapedRecipe(new ItemStack(Items.GUNPOWDER), "CF", 'C', new ItemStack(Items.COAL, 1, OreDictionary.WILDCARD_VALUE), 'F', Items.FLINT);
		GameRegistry.addShapedRecipe(new ItemStack(Items.SKULL, 1, 0), "BB", "BB", 'B', Items.BONE); // skeleton
		GameRegistry.addShapedRecipe(new ItemStack(Items.SKULL, 1, 1), "SS", "SS", 'S', new ItemStack(Items.SKULL, 1, 0)); // wither skeleton
		GameRegistry.addShapedRecipe(new ItemStack(Items.SKULL, 1, 2), "RR", "RR", 'R', Items.ROTTEN_FLESH); // zombie
		GameRegistry.addShapedRecipe(new ItemStack(Items.SKULL, 1, 3), "BB", "BB", 'B', Items.BEEF); // player
		GameRegistry.addShapedRecipe(new ItemStack(Items.SKULL, 1, 4), "GG", "GG", 'G', Items.GUNPOWDER); // creeper
		GameRegistry.addShapedRecipe(new ItemStack(Items.BONE, 3), "  Q", " Q ", "Q  ", 'Q', Items.QUARTZ);
		GameRegistry.addShapedRecipe(new ItemStack(Items.SLIME_BALL), "GS", 'G', new ItemStack(Items.DYE, 1, 2), 'S', Items.SUGAR);
		GameRegistry.addShapedRecipe(new ItemStack(Items.ROTTEN_FLESH), "BD", 'B', Items.BEEF, 'D', Blocks.DIRT);
		GameRegistry.addShapedRecipe(new ItemStack(Items.NETHER_STAR), " S ", "SOS", " S ", 'S', new ItemStack(Items.SKULL, 1, 1), 'O', Blocks.SOUL_SAND);
		GameRegistry.addShapedRecipe(new ItemStack(Items.GHAST_TEAR), " B ", "BWB", " B ", 'B', new ItemStack(Items.DYE, 1, 15), 'W', new ItemStack(Items.POTIONITEM, 1, 0));
		GameRegistry.addShapedRecipe(new ItemStack(Items.ENDER_PEARL), "SS", "SS", 'S', Items.SLIME_BALL);
	}
	
}
