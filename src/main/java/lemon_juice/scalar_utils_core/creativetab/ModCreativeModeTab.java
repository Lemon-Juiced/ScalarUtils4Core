package lemon_juice.scalar_utils_core.creativetab;

import lemon_juice.scalar_utils_core.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SCALAR_UTILS_TAB = new CreativeModeTab("coreTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FLOUR.get());
        }
    };
}
