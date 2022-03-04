package net.onvoid.enderitesdelight.common;

import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.onvoid.enderitesdelight.EnderitesDelight;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.items.KnifeItem;

public class EnderitesDelightItems {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EnderitesDelight.MODID);

    public static final RegistryObject<Item> ENDERITE_KNIFE = ITEMS.register("enderite_knife", () ->
            new KnifeItem(EnderitesDelightTiers.ENDERITE, 0.5F, -2.0F, new Item.Properties()
                    .tab(FarmersDelight.ITEM_GROUP)));

    public static void create(IEventBus bus) {
        ITEMS.register(bus);
    }
}
