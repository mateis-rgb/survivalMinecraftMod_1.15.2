
package net.mcreator.survivalmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.survivalmod.itemgroup.SurvivalModItemGroup;
import net.mcreator.survivalmod.SurvivalmodModElements;

@SurvivalmodModElements.ModElement.Tag
public class YellowFragmentItem extends SurvivalmodModElements.ModElement {
	@ObjectHolder("survivalmod:yellow_fragment")
	public static final Item block = null;
	public YellowFragmentItem(SurvivalmodModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SurvivalModItemGroup.tab).maxStackSize(1).rarity(Rarity.EPIC));
			setRegistryName("yellow_fragment");
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
	}
}
