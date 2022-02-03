package net.onvoid.enderitesdelight.common;

import io.github.lieonlion.enderite.core.BaseToolMaterial;
import io.github.lieonlion.enderite.core.init.ItemInit;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.onvoid.enderitesdelight.EnderitesDelight;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.item.KnifeItem;

public class EnderitesDelightItems {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EnderitesDelight.MODID);

    protected static final Tier ENDERITE = new BaseToolMaterial(5.0F, 25, 5, 20.0F, 2401, () -> {
        return Ingredient.of(ItemInit.ENDERITE_INGOT.get());
    });
    protected static final Tier OBSIDIAN_INFUSED = new BaseToolMaterial(6.0F, 30, 5, 25.0F, 2771, () -> {
        return Ingredient.of(ItemInit.OBSIDIAN_INFUSED_ENDERITE_INGOT.get());
    });

    public static final RegistryObject<Item> ENDERITE_KNIFE = ITEMS.register("enderite_knife", () ->
            new KnifeItem(ENDERITE, 0.5F, -2.0F, new Item.Properties()
                    .tab(FarmersDelight.CREATIVE_TAB)));
    public static final RegistryObject<Item> OBSIDIAN_INFUSED_ENDERITE_KNIFE = ITEMS.register("obsidian_infused_enderite_knife", () ->
            new KnifeItem(OBSIDIAN_INFUSED, 0.5F, -2.0F, new Item.Properties()
                    .tab(FarmersDelight.CREATIVE_TAB)));

    public static void create(IEventBus bus) {
        ITEMS.register(bus);
    }
}
