package io.github.kokkiemouse.yjsnpi_mod;

import io.github.kokkiemouse.yjsnpi_mod.blocks.YJSNPI_Block;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class yjsnpimodMain implements ModInitializer {
    public static final Identifier IKISUGI_SOUND_ID=new Identifier("yjsnpimod:ikisugi");
    public static final YJSNPI_Block yajuBlock=new YJSNPI_Block(Block.Settings.of(Material.STONE));
    public static SoundEvent IKISUGI_SOUND_EVENT=new SoundEvent(IKISUGI_SOUND_ID);
    @Override
    public void onInitialize() {
        Init_Register();
    }
    private void Init_Register(){
        Registry.register(Registry.SOUND_EVENT,IKISUGI_SOUND_ID,IKISUGI_SOUND_EVENT);
        Registry.register(Registry.BLOCK,new Identifier("yjsnpimod","ikisugi_block"),yajuBlock);
        Registry.register(Registry.ITEM,new Identifier("yjsnpimod","ikisugi_block"),new BlockItem(yajuBlock,new Item.Settings().group(ItemGroup.TOOLS)));
    }

}
