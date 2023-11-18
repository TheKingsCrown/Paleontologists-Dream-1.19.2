package tkc.paleontologistsdream.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import tkc.paleontologistsdream.PaleontologistsDream;

public class ModItemGroup {


    public static final ItemGroup DINOMOD = FabricItemGroupBuilder.build(
            new Identifier(PaleontologistsDream.MOD_ID, "dinomod"), () -> new ItemStack(ModItems.AMBER_FOSSIL_INSECT));

}
