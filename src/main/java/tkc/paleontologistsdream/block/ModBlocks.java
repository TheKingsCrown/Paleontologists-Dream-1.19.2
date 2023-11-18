package tkc.paleontologistsdream.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import tkc.paleontologistsdream.PaleontologistsDream;
import tkc.paleontologistsdream.block.custom.CentrifugeBlock;
import tkc.paleontologistsdream.item.ModItemGroup;

public class ModBlocks {


    public static final Block AMBER_ORE = registerBlock("amber_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(3, 5)), ModItemGroup.DINOMOD);
    public static final Block CENTRIFUGE = registerBlock("centrifuge",
            new CentrifugeBlock(FabricBlockSettings.of(Material.GLASS).strength(4f).requiresTool()
                    .nonOpaque()), ModItemGroup.DINOMOD);



    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(PaleontologistsDream.MOD_ID, name), block);
    }



    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(PaleontologistsDream.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        PaleontologistsDream.LOGGER.debug("Loading Blocks For: " + PaleontologistsDream.MOD_ID);
    }
}
