package tkc.paleontologistsdream;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tkc.paleontologistsdream.block.ModBlocks;
import tkc.paleontologistsdream.fluid.ModFluids;
import tkc.paleontologistsdream.item.ModItems;

public class PaleontologistsDream implements ModInitializer {

	public static final String MOD_ID = "paleontologists-dream";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModFluids.register();
	}
}