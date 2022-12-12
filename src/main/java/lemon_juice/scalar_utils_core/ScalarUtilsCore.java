package lemon_juice.scalar_utils_core;

import lemon_juice.scalar_utils_core.block.ModBlocks;
import lemon_juice.scalar_utils_core.event.CreativeTabEvent;
import lemon_juice.scalar_utils_core.item.ModItems;
import lemon_juice.scalar_utils_core.loot.ModLootModifiers;
import lemon_juice.scalar_utils_core.world.feature.ModConfiguredFeatures;
import lemon_juice.scalar_utils_core.world.feature.ModPlacedFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ScalarUtilsCore.MOD_ID)
public class ScalarUtilsCore {
    public static final String MOD_ID = "scalar_utils_core";

    public ScalarUtilsCore() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModLootModifiers.register(modEventBus);

        //Black Lotus Generation
        //ModConfiguredFeatures.register(modEventBus);
        //ModPlacedFeatures.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(CreativeTabEvent::onCreativeModeTabRegister);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BLACK_LOTUS.getId(), ModBlocks.POTTED_BLACK_LOTUS);
        });
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
