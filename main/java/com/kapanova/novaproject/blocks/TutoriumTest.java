package com.kapanova.novaproject.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class TutoriumTest extends BlockBase {
	public static final AxisAlignedBB BOX = new AxisAlignedBB(0.375D, 0.0D, 0.375D, 0.625D, 0.675D, 0.625D);
	public TutoriumTest(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(1.0F);
	}
	@Override
	public boolean isFullCube(IBlockState iBlockState) {
		return false;
	}

	@Override
	public boolean isOpaqueCube(IBlockState iBlockState) {
		return false;
	}
	@Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) 
    {
        return BOX;
    }

}