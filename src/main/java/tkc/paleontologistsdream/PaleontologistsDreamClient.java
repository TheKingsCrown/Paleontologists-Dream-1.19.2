package tkc.paleontologistsdream;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import tkc.paleontologistsdream.block.ModBlocks;
import tkc.paleontologistsdream.fluid.ModFluids;

public class PaleontologistsDreamClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_SALINE_SOLUTION, ModFluids.FLOWING_SALINE_SOLUTION,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"),
                        0xA0C9F3FA
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_SALINE_SOLUTION, ModFluids.FLOWING_SALINE_SOLUTION);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CENTRIFUGE, RenderLayer.getTranslucent());

    }
}
