package lemon_juice.scalar_utils_core.item;

import lemon_juice.scalar_utils_core.ModCreativeModeTab;
import lemon_juice.scalar_utils_core.ScalarUtilsCore;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ScalarUtilsCore.MOD_ID);

    //Flour
    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Glass Cutter
    //public static final RegistryObject<Item> GLASS_CUTTER = ITEMS.register("glass_cutter", () -> new GlassCutterItem(Tiers.IRON, 1, 1f, new Item.Properties().durability(1023).tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    //Tiny Coals
    public static final RegistryObject<Item> TINY_CHARCOAL = ITEMS.register("tiny_charcoal", () -> new FuelItem(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));
    public static final RegistryObject<Item> TINY_COAL = ITEMS.register("tiny_coal", () -> new FuelItem(new Item.Properties().tab(ModCreativeModeTab.SCALAR_UTILS_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
