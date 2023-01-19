package com.zacharybarbanell.truss;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class TrussBlock extends Block {
    public TrussBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    public boolean isPossibleToRespawnInThis() {
        return true;
    }


}