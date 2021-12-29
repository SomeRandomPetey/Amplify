package com.petey.amplify.data;

import com.petey.amplify.core.ModBlocks;
import com.petey.amplify.core.ModItems;
import net.minecraft.advancements.criterion.StatePropertiesPredicate;
import net.minecraft.block.Block;
import net.minecraft.block.CropsBlock;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.loot.conditions.BlockStateProperty;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraftforge.fml.RegistryObject;

public class ModBlockLootTables extends BlockLootTables {
    @Override
    protected void addTables() {
        this.add(ModBlocks.NECTAR.get(), createCropDrops(ModBlocks.NECTAR.get(), ModItems.NECTAR.get(), ModBlocks.NECTAR_SEEDS.get(), getILootCondition$IBuilder(ModBlocks.NECTAR.get())));
    }

    private BlockStateProperty.Builder getILootCondition$IBuilder(Block pBlock) {
        return BlockStateProperty.hasBlockStateProperties(pBlock).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CropsBlock.AGE, 7));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
