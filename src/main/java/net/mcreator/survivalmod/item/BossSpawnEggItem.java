
package net.mcreator.survivalmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.ActionResultType;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.BlockState;

import net.mcreator.survivalmod.procedures.BossSpawnEggLorsDunClickDroitSurUnBlocProcedure;
import net.mcreator.survivalmod.itemgroup.SurvivalModItemGroup;
import net.mcreator.survivalmod.SurvivalmodModElements;

import java.util.Map;
import java.util.HashMap;

@SurvivalmodModElements.ModElement.Tag
public class BossSpawnEggItem extends SurvivalmodModElements.ModElement {
	@ObjectHolder("survivalmod:boss_spawn_egg")
	public static final Item block = null;
	public BossSpawnEggItem(SurvivalmodModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SurvivalModItemGroup.tab).maxStackSize(1).rarity(Rarity.EPIC));
			setRegistryName("boss_spawn_egg");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 0F;
		}

		@Override
		public ActionResultType onItemUseFirst(ItemStack stack, ItemUseContext context) {
			ActionResultType retval = super.onItemUseFirst(stack, context);
			World world = context.getWorld();
			BlockPos pos = context.getPos();
			PlayerEntity entity = context.getPlayer();
			Direction direction = context.getFace();
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			ItemStack itemstack = context.getItem();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				BossSpawnEggLorsDunClickDroitSurUnBlocProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
