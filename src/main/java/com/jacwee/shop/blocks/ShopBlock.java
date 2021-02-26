package com.jacwee.shop.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ShopBlock extends Block{
	
	public ShopBlock(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}
