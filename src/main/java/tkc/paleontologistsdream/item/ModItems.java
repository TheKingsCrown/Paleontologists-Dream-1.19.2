package tkc.paleontologistsdream.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tkc.paleontologistsdream.PaleontologistsDream;
import tkc.paleontologistsdream.block.ModBlocks;
import tkc.paleontologistsdream.item.custom.SyringeItem;

public class ModItems extends Items {

    public static final Item AMBER_FOSSIL_INSECT = registerItem("amber_fossil_insect",
            new Item(new FabricItemSettings().group(ModItemGroup.DINOMOD)));
    public static final Item AMBER_FOSSIL_PLANT = registerItem("amber_fossil_plant",
            new Item(new FabricItemSettings().group(ModItemGroup.DINOMOD)));
    public static final Item TEST_TUBE_EMPTY = registerItem("test_tube_empty",
            new Item(new FabricItemSettings().group(ModItemGroup.DINOMOD)));
    public static final Item TEST_TUBE_FILLED = registerItem("test_tube_filled",
            new Item(new FabricItemSettings().group(ModItemGroup.DINOMOD).maxCount(1)
                    .recipeRemainder(TEST_TUBE_EMPTY)));
    public static final Item SYRINGE_EMPTY = registerItem("syringe_empty",
            new SyringeItem(new FabricItemSettings().group(ModItemGroup.DINOMOD)));
    public static final Item SYRINGE_FILLED = registerItem("syringe_filled",
            new Item(new FabricItemSettings().group(ModItemGroup.DINOMOD).maxCount(1)
                    .recipeRemainder(SYRINGE_EMPTY)));



    private static Item registerItem (String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(PaleontologistsDream.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PaleontologistsDream.LOGGER.debug("Loading Mod Items For: " + PaleontologistsDream.MOD_ID);

    }
}
