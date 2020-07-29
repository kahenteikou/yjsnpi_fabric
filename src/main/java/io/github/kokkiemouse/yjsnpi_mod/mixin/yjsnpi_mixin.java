package io.github.kokkiemouse.yjsnpi_mod.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class yjsnpi_mixin {
    @Inject(at = @At("HEAD"),method = "init()V")
    private void init(CallbackInfo info){
        System.out.println("This line is printed by a yjsnpi mod mixin!");
        System.out.println(info);
    }
}
