
package hskgzscz.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import hskgzscz.init.HskgzsczModTabs;

public class BanZhuanItem extends SwordItem {
	public BanZhuanItem() {
		super(new Tier() {
			public int getUses() {
				return 1000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 98f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -3.1f, new Item.Properties().tab(HskgzsczModTabs.TAB_ZZUOZHEDEWUQI));
	}
}
