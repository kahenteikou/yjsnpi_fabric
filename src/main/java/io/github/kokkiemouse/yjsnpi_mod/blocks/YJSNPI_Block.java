package io.github.kokkiemouse.yjsnpi_mod.blocks;

import io.github.kokkiemouse.yjsnpi_mod.yjsnpimodMain;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class YJSNPI_Block extends Block {
    public YJSNPI_Block(Settings settings){
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if(!world.isClient){
            sound_play(world,pos, yjsnpimodMain.IKISUGI_SOUND_EVENT);
        }
        return ActionResult.SUCCESS;
    }

    /**
     * サウンド再生(ブロック)
     * @param world ワールド
     * @param blockPos ブロック座標
     * @param soundEvent サウンドイベント
     */
    private void sound_play(World world, BlockPos blockPos, SoundEvent soundEvent){
        world.playSound(null,blockPos,soundEvent, SoundCategory.BLOCKS,1f,1f);
    }
}
