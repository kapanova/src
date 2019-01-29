package com.kapanova.novaproject.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TutoriumBlock extends BlockBase {

	public TutoriumBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(8.0F);
	}

}

