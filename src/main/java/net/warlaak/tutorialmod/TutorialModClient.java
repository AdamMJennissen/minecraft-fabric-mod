package net.warlaak.tutorialmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.warlaak.tutorialmod.block.ModBlocks;

public class TutorialModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        //make texture see-through
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EGGPLANT_CROP, RenderLayer.getCutout());
    }
}
