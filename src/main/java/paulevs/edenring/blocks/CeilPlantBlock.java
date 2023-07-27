package paulevs.edenring.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.BlockState;
import org.betterx.bclib.blocks.BasePlantBlock;
import org.betterx.bclib.client.render.BCLRenderLayer;

public class CeilPlantBlock extends BasePlantBlock {
	public CeilPlantBlock(Properties settings) {
		super(settings);
	}
	
	@Override
	protected boolean isTerrain(BlockState state) {
		return true;
	}
	
	@Override
	public boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
		BlockState up = world.getBlockState(pos.above());
		return up.isFaceSturdy(world, pos, Direction.DOWN);
	}
	
	@Override
	public BCLRenderLayer getRenderLayer() {
		return BCLRenderLayer.CUTOUT;
	}
}
