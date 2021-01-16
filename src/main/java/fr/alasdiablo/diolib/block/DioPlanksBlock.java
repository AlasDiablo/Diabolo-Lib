package fr.alasdiablo.diolib.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class DioPlanksBlock extends Block {
    public DioPlanksBlock(MaterialColor color, String registryName) {
        super(AbstractBlock.Properties.create(Material.WOOD, color).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD));
        this.setRegistryName(registryName);
    }
}