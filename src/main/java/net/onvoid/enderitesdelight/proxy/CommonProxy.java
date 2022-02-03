package net.onvoid.enderitesdelight.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.onvoid.enderitesdelight.EnderitesDelight;
import net.onvoid.enderitesdelight.common.EnderitesDelightItems;

@Mod.EventBusSubscriber(modid = EnderitesDelight.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonProxy {

    public void start() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;
        EnderitesDelightItems.create(modBus);
    }
}
