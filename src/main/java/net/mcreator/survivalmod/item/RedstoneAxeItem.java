
package net.mcreator.survivalmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.survivalmod.itemgroup.SurvivalModItemGroup;
import net.mcreator.survivalmod.SurvivalmodModElements;

@SurvivalmodModElements.ModElement.Tag
public class RedstoneAxeItem extends SurvivalmodModElements.ModElement {
	@ObjectHolder("survivalmod:redstone_axe")
	public static final Item block = null;
	public RedstoneAxeItem(SurvivalmodModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2750;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 5f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RedstoneIngotItem.block, (int) (1)));
			}
		}, 1, -2f, new Item.Properties().group(SurvivalModItemGroup.tab)) {
		}.setRegistryName("redstone_axe"));
	}
}
