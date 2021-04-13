package net.mcreator.survivalmod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.survivalmod.block.MossyChiseledStoneBricksBlock;
import net.mcreator.survivalmod.SurvivalmodModElements;

import java.util.Map;

@SurvivalmodModElements.ModElement.Tag
public class BossSpawnEggLorsDunClickDroitSurUnBlocProcedure extends SurvivalmodModElements.ModElement {
	public BossSpawnEggLorsDunClickDroitSurUnBlocProcedure(SurvivalmodModElements instance) {
		super(instance, 22);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure BossSpawnEggLorsDunClickDroitSurUnBloc!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure BossSpawnEggLorsDunClickDroitSurUnBloc!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure BossSpawnEggLorsDunClickDroitSurUnBloc!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure BossSpawnEggLorsDunClickDroitSurUnBloc!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure BossSpawnEggLorsDunClickDroitSurUnBloc!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == MossyChiseledStoneBricksBlock.block.getDefaultState()
				.getBlock())) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("The Boss is going to born."), (true));
			}
		}
	}
}
