package lemon_juice.scalar_utils_core.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class FuelItem extends Item {
    public FuelItem(Properties p_41383_) {
        super(p_41383_);
    }

    //Set Burn Time to 200 Ticks (1 Item Worth)
    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 200;
    }
}
