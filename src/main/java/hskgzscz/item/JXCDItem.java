
package hskgzscz.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import hskgzscz.init.HskgzsczModTabs;

public class JXCDItem extends SwordItem {
	public JXCDItem() {
		super(new Tier() {
			public int getUses() {
				return 10000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 898f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 220;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -3.5f, new Item.Properties().tab(HskgzsczModTabs.TAB_ZZUOZHEDEWUQI).fireResistant());
	}
}
