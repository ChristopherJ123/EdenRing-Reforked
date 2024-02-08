package paulevs.datagen.worldgen;

import java.util.concurrent.CompletableFuture;

import org.betterx.bclib.api.v3.datagen.RegistriesDataProvider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.core.HolderLookup;
import paulevs.edenring.EdenRing;
import paulevs.datagen.EdenRingRegistrySupplier;

public class EdenRingRegistriesDataProvider extends RegistriesDataProvider {
    public EdenRingRegistriesDataProvider(
            FabricDataOutput output,
            CompletableFuture<HolderLookup.Provider> registriesFuture
    ) {
        super(EdenRing.LOGGER, EdenRingRegistrySupplier.INSTANCE, output, registriesFuture);
    }
}
