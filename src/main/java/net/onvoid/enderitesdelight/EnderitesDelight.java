package net.onvoid.enderitesdelight;

import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.onvoid.enderitesdelight.proxy.ClientProxy;
import net.onvoid.enderitesdelight.proxy.CommonProxy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("enderitesdelight")
public class EnderitesDelight
{
    public static final String MODID = "enderitesdelight";
    public static EnderitesDelight instance;
    public static CommonProxy proxy;
    private static final Logger LOGGER = LogManager.getLogger();

    public EnderitesDelight() {
        instance = this;

        proxy = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> CommonProxy::new);
        proxy.start();
    }
}
