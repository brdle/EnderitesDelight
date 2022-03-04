package net.onvoid.enderitesdelight;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ForgeTagHandler;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.onvoid.enderitesdelight.proxy.ClientProxy;
import net.onvoid.enderitesdelight.proxy.CommonProxy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Supplier;

@Mod("enderitesdelight")
public class EnderitesDelight
{
    public static final String MODID = "enderitesdelight";
    public static EnderitesDelight instance;
    public static CommonProxy proxy;
    private static final Logger LOGGER = LogManager.getLogger();
    public static final Supplier<Ingredient> enderiteIngredient = () -> Ingredient.of(ForgeTagHandler.makeWrapperTag(ForgeRegistries.ITEMS, new ResourceLocation("forge", "ingots/enderite")));

    public EnderitesDelight() {
        instance = this;

        proxy = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> CommonProxy::new);
        proxy.start();
    }
}
