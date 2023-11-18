package tkc.paleontologistsdream.fluid;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tkc.paleontologistsdream.PaleontologistsDream;
import tkc.paleontologistsdream.item.ModItemGroup;

public class ModFluids {

    public static FlowableFluid STILL_SALINE_SOLUTION;
    public static FlowableFluid FLOWING_SALINE_SOLUTION;
    public static Block SALINE_SOLUTION_BLOCK;
    public static Item SALINE_SOLUTION_BUCKET;

    public static void register() {

        STILL_SALINE_SOLUTION = Registry.register(Registry.FLUID,
                new Identifier(PaleontologistsDream.MOD_ID, "saline_solution"), new SalineSolutionFluid.Still());
        FLOWING_SALINE_SOLUTION = Registry.register(Registry.FLUID,
                new Identifier(PaleontologistsDream.MOD_ID, "flowing_saline_solution"), new SalineSolutionFluid.Flowing());

        SALINE_SOLUTION_BLOCK = Registry.register(Registry.BLOCK, new Identifier(PaleontologistsDream.MOD_ID, "saline_solution_block"),
                new FluidBlock(ModFluids.STILL_SALINE_SOLUTION, FabricBlockSettings.copyOf(Blocks.WATER)));
        SALINE_SOLUTION_BUCKET = Registry.register((Registry.ITEM), new Identifier(PaleontologistsDream.MOD_ID, "saline_solution_bucket"),
                new BucketItem(ModFluids.STILL_SALINE_SOLUTION, new FabricItemSettings().maxCount(1).recipeRemainder(Items.BUCKET).group(ModItemGroup.DINOMOD)));

    }
}
