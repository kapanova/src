package com.kapanova.novaproject.init;

import java.util.ArrayList;
import java.util.List;

import com.kapanova.novaproject.blocks.BlockBase;
import com.kapanova.novaproject.blocks.TutoriumBlock;
import com.kapanova.novaproject.blocks.TutoriumOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block TUTORIUM_ORE = new TutoriumOre("tutorium_ore", Material.ROCK);
	public static final Block TUTORIUM_BLOCK = new TutoriumBlock("tutorium_block", Material.IRON);
	
}
