package com.kapanova.novaproject.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Glowing_Tutorium_Stone extends BlockBreakable{
	public Glowing_Tutorium_Stone() {
		super(Material.ICE, false);
	}
	@Override
	public boolean isFullCube(IBlockState iBlockState) {
		return false;
	}
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }
}
