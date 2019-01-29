package com.kapanova.novaproject.blocks;

import com.kapanova.novaproject.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TutoriumOre extends BlockBase {

	public TutoriumOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 1);
	}
	//@Override
	//public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		//return ModItems.TUTORIUM_ORE;
		
	}
	//@Override
	//public int quantityDropped(Random rand){
	// return #;
	// int max = #;
	// int min = #;
	//return rand.nextInt(max) + min;
