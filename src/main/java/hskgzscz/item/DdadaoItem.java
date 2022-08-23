
package hskgzscz.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import hskgzscz.init.HskgzsczModTabs;

public class DdadaoItem extends SwordItem {
	public DdadaoItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 50f;
			}

			public float getAttackDamageBonus() {
				return 9998f;
			}

			public int getLevel() {
				return 8;
			}

			public int getEnchantmentValue() {
				return 200;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, 6f, new Item.Properties().tab(HskgzsczModTabs.TAB_ZZUOZHEDEWUQI).fireResistant());
	}
}
