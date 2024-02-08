package paulevs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Item;
import org.betterx.bclib.api.v3.datagen.TagDataProvider;
import org.betterx.worlds.together.tag.v3.TagManager;
import paulevs.edenring.EdenRing;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class EdenRingItemTagDataProvider extends TagDataProvider<Item> {
    public EdenRingItemTagDataProvider(
            FabricDataOutput output,
            CompletableFuture<HolderLookup.Provider> registriesFuture
    ) {
        super(TagManager.ITEMS, List.of(EdenRing.MOD_ID), output, registriesFuture);
    }
}
