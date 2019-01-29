package com.kapanova.novaproject.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockProperties;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GlowingTutoriumStone extends BlockBase{
	public GlowingTutoriumStone(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.GLASS);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(1.0F);
		setDefaultSlipperiness(.98f);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
	@Override
	public boolean isFullCube(IBlockState iBlockState) {
		return false;
	}
	@Override
	public boolean isFullBlock(IBlockState iBlockState){
		return false;
	}
    @Override
	public boolean isOpaqueCube(IBlockState iBlockState) {
		return false;
	}
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }


    
}
