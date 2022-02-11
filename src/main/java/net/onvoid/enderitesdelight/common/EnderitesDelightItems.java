package net.onvoid.enderitesdelight.common;

import io.github.lieonlion.enderite.core.init.ItemInit;
import io.github.lieonlion.enderite.core.init.ToolMaterialInit;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.onvoid.enderitesdelight.EnderitesDelight;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.item.KnifeItem;

public class EnderitesDelightItems {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EnderitesDelight.MODID);

    public static final Tier ENDERITE_KNIFE_TIER = new ToolMaterialInit(5.0F,
            ToolMaterialInit.ENDERITE.getEnchantmentValue(),
            ToolMaterialInit.ENDERITE.getLevel(),
            ToolMaterialInit.ENDERITE.getSpeed(),
            ToolMaterialInit.ENDERITE.getUses(),
            ToolMaterialInit.ENDERITE::getRepairIngredient);

    public static final RegistryObject<Item> ENDERITE_KNIFE = ITEMS.register("enderite_knife", () ->
            new KnifeItem(ENDERITE_KNIFE_TIER, 0.5F, -2.0F, new Item.Properties()
                    .tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> OBSIDIAN_INFUSED_ENDERITE_KNIFE = ITEMS.register("obsidian_infused_enderite_knife", () ->
            new KnifeItem(ToolMaterialInit.OBSIDIAN_INFUSED, 0.5F, -2.0F, new Item.Properties()
                    .tab(FarmersDelight.CREATIVE_TAB)));

    public static void create(IEventBus bus) {
        ITEMS.register(bus);
    }
}
