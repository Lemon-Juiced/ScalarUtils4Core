package lemon_juice.scalar_utils_core.event;

import lemon_juice.scalar_utils_core.ScalarUtilsCore;
import lemon_juice.scalar_utils_core.block.ModBlocks;
import lemon_juice.scalar_utils_core.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class CreativeTabEvent {
    public static CreativeModeTab SCALAR_UTILS_CORE_TAB;

    @SubscribeEvent
    public static void onCreativeModeTabRegister(CreativeModeTabEvent.Register event){
        SCALAR_UTILS_CORE_TAB = event.registerCreativeModeTab(new ResourceLocation(ScalarUtilsCore.MOD_ID, "scalar_utils_core"), builder -> {
                builder.icon(() -> new ItemStack(ModItems.FLOUR.get()))
                    .displayItems((features, output, hasPermissions) -> {
                        output.accept(new ItemStack(ModItems.ARTIFICIAL_SLIMEBALL.get()));
                        output.accept(new ItemStack(ModItems.ILLUMINATION_POWDER.get()));
                        output.accept(new ItemStack(ModItems.FLOUR.get()));
                        output.accept(new ItemStack(ModItems.GLASS_CUTTER.get()));
                        output.accept(new ItemStack(ModItems.TINY_CHARCOAL.get()));
                        output.accept(new ItemStack(ModItems.TINY_COAL.get()));

                        output.accept(new ItemStack(ModBlocks.BLACK_LOTUS.get()));
                        output.accept(new ItemStack(ModBlocks.BLACK_ILLUMINATION_BLOCK.get()));
                        output.accept(new ItemStack(ModBlocks.BLUE_ILLUMINATION_BLOCK.get()));
                        output.accept(new ItemStack(ModBlocks.BROWN_ILLUMINATION_BLOCK.get()));
                        output.accept(new ItemStack(ModBlocks.CYAN_ILLUMINATION_BLOCK.get()));
                        output.accept(new ItemStack(ModBlocks.GRAY_ILLUMINATION_BLOCK.get()));
                        output.accept(new ItemStack(ModBlocks.GREEN_ILLUMINATION_BLOCK.get()));
                        output.accept(new ItemStack(ModBlocks.LIGHT_BLUE_ILLUMINATION_BLOCK.get()));
                        output.accept(new ItemStack(ModBlocks.LIGHT_GRAY_ILLUMINATION_BLOCK.get()));
                        output.accept(new ItemStack(ModBlocks.LIME_ILLUMINATION_BLOCK.get()));
                        output.accept(new ItemStack(ModBlocks.MAGENTA_ILLUMINATION_BLOCK.get()));
                        output.accept(new ItemStack(ModBlocks.ORANGE_ILLUMINATION_BLOCK.get()));
                        output.accept(new ItemStack(ModBlocks.PINK_ILLUMINATION_BLOCK.get()));
                        output.accept(new ItemStack(ModBlocks.PURPLE_ILLUMINATION_BLOCK.get()));
                        output.accept(new ItemStack(ModBlocks.WHITE_ILLUMINATION_BLOCK.get()));
                        output.accept(new ItemStack(ModBlocks.YELLOW_ILLUMINATION_BLOCK.get()));
                    })
                    .title(Component.translatable("itemGroup.scalar_utils_core"))
                    .build();
        });
    }
}
