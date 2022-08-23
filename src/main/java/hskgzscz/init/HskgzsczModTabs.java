
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package hskgzscz.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class HskgzsczModTabs {
	public static CreativeModeTab TAB_TTOTEYEXIAOWEI;
	public static CreativeModeTab TAB_ZZUOZHEDEWUQI;
	public static CreativeModeTab TAB_GE_GE_CHONG_ZHU_BO;

	public static void load() {
		TAB_TTOTEYEXIAOWEI = new CreativeModeTab("tabttoteyexiaowei") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.NOTE_BLOCK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_ZZUOZHEDEWUQI = new CreativeModeTab("tabzzuozhedewuqi") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.DIAMOND_SWORD);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_GE_GE_CHONG_ZHU_BO = new CreativeModeTab("tabge_ge_chong_zhu_bo") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.LIGHT);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
