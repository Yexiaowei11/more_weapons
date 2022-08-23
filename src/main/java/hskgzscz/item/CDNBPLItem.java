
package hskgzscz.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

import hskgzscz.init.HskgzsczModTabs;
import hskgzscz.init.HskgzsczModSounds;

public class CDNBPLItem extends RecordItem {
	public CDNBPLItem() {
		super(0, HskgzsczModSounds.REGISTRY.get(new ResourceLocation("hskgzscz:flower_dance")),
				new Item.Properties().tab(HskgzsczModTabs.TAB_TTOTEYEXIAOWEI).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Flower Dance--yexiaowei"));
	}
}
