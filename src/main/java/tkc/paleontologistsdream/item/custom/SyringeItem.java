package tkc.paleontologistsdream.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import tkc.paleontologistsdream.item.ModItems;

import java.util.List;

public class SyringeItem extends Item {
    public SyringeItem(Settings settings) {
        super(settings);
    }


    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        if (user.getHealth() >= 2 && hand.equals(Hand.MAIN_HAND)) {
            user.getItemCooldownManager().set(this, 20);
            return TypedActionResult.success(this.fill(itemStack, user, new ItemStack(ModItems.SYRINGE_FILLED)));

        }
        return TypedActionResult.pass(itemStack);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()) {
            tooltip.add(Text.literal("Right Click to Draw Your Own Blood").formatted(Formatting.YELLOW));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }

    protected ItemStack fill(ItemStack stack, PlayerEntity player, ItemStack outputStack) {
        player.damage(DamageSource.player(player), 2);
        player.incrementStat(Stats.USED.getOrCreateStat(this));
        return ItemUsage.exchangeStack(stack, player, outputStack);


    }

    @Override
    protected String getOrCreateTranslationKey() {
        return super.getOrCreateTranslationKey();
    }
}
