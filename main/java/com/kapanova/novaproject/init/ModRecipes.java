package com.kapanova.novaproject.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		
		GameRegistry.addSmelting(ModBlocks.TUTORIUM_ORE, new ItemStack(ModItems.TUTORIUM_INGOT, 1), 0.7f);
	}

}
