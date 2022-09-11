package lemon_juice.scalar_utils_core.block;

import lemon_juice.scalar_utils_core.ModCreativeModeTab;
import lemon_juice.scalar_utils_core.ScalarUtilsCore;
import lemon_juice.scalar_utils_core.item.ModItems;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ScalarUtilsCore.MOD_ID);

    //Black Lotus
    public static final RegistryObject<Block> BLACK_LOTUS = registerBlock("black_lotus", () -> new FlowerBlock(MobEffects.GLOWING, 0, BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> POTTED_BLACK_LOTUS = registerBlockWithoutBlockItem("potted_black_lotus", () -> new FlowerPotBlock(null, ModBlocks.BLACK_LOTUS, BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()));

    //Illumination Blocks
    public static final RegistryObject<Block> BLACK_ILLUMINATION_BLOCK = registerBlock("black_illumination_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().lightLevel((p_50872_) -> {return 15;})), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> BLUE_ILLUMINATION_BLOCK = registerBlock("blue_illumination_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().lightLevel((p_50872_) -> {return 15;})), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> BROWN_ILLUMINATION_BLOCK = registerBlock("brown_illumination_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().lightLevel((p_50872_) -> {return 15;})), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> CYAN_ILLUMINATION_BLOCK = registerBlock("cyan_illumination_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().lightLevel((p_50872_) -> {return 15;})), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> GRAY_ILLUMINATION_BLOCK = registerBlock("gray_illumination_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().lightLevel((p_50872_) -> {return 15;})), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> GREEN_ILLUMINATION_BLOCK = registerBlock("green_illumination_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().lightLevel((p_50872_) -> {return 15;})), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> LIGHT_BLUE_ILLUMINATION_BLOCK = registerBlock("light_blue_illumination_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().lightLevel((p_50872_) -> {return 15;})), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> LIGHT_GRAY_ILLUMINATION_BLOCK = registerBlock("light_gray_illumination_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().lightLevel((p_50872_) -> {return 15;})), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> LIME_ILLUMINATION_BLOCK = registerBlock("lime_illumination_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().lightLevel((p_50872_) -> {return 15;})), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> MAGENTA_ILLUMINATION_BLOCK = registerBlock("magenta_illumination_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().lightLevel((p_50872_) -> {return 15;})), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> ORANGE_ILLUMINATION_BLOCK = registerBlock("orange_illumination_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().lightLevel((p_50872_) -> {return 15;})), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> PINK_ILLUMINATION_BLOCK = registerBlock("pink_illumination_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().lightLevel((p_50872_) -> {return 15;})), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> PURPLE_ILLUMINATION_BLOCK = registerBlock("purple_illumination_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().lightLevel((p_50872_) -> {return 15;})), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> RED_ILLUMINATION_BLOCK = registerBlock("red_illumination_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().lightLevel((p_50872_) -> {return 15;})), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> WHITE_ILLUMINATION_BLOCK = registerBlock("white_illumination_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().lightLevel((p_50872_) -> {return 15;})), ModCreativeModeTab.SCALAR_UTILS_TAB);
    public static final RegistryObject<Block> YELLOW_ILLUMINATION_BLOCK = registerBlock("yellow_illumination_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().lightLevel((p_50872_) -> {return 15;})), ModCreativeModeTab.SCALAR_UTILS_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
