
package net.mcreator.survivalmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.survivalmod.itemgroup.SurvivalModItemGroup;
import net.mcreator.survivalmod.SurvivalmodModElements;

@SurvivalmodModElements.ModElement.Tag
public class RestoneSwordItem extends SurvivalmodModElements.ModElement {
	@ObjectHolder("survivalmod:restone_sword")
	public static final Item block = null;
	public RestoneSwordItem(SurvivalmodModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
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
		}, 3, -3f, new Item.Properties().group(SurvivalModItemGroup.tab)) {
		}.setRegistryName("restone_sword"));
	}
}
