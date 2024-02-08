package paulevs.datagen.recipes;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import org.betterx.bclib.api.v3.datagen.BlockLootTableProvider;
import paulevs.edenring.EdenRing;

import java.util.List;

public class EdenRingBlockLootTableProvider extends BlockLootTableProvider {
    public EdenRingBlockLootTableProvider(FabricDataOutput output) {
        super(output, List.of(EdenRing.MOD_ID));
    }
}
