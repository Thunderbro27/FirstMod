package net.Thunderbro27.firstmod.block.custom;

import net.Thunderbro27.firstmod.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class ConverterBlock extends SlabBlock {
    public ConverterBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos,
                                               Player pPlayer, BlockHitResult pHitResult) {

        pLevel.playSound(pPlayer,pPos, SoundEvents.AMETHYST_CLUSTER_PLACE, SoundSource.BLOCKS,1f,1f);
        return InteractionResult.SUCCESS;
    }


    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        if(pEntity instanceof ItemEntity itemEntity){

            if(isValidItem(itemEntity.getItem())){
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));

            }

        }

        super.stepOn(pLevel, pPos, pState, pEntity);
    }

    private boolean isValidItem(ItemStack item) {
        return item.is(ModTags.Items.TRANS_ITEMS);
    }
}
