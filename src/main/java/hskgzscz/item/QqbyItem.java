
package hskgzscz.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import hskgzscz.init.HskgzsczModTabs;
import hskgzscz.init.HskgzsczModSounds;

public class QqbyItem extends RecordItem {
	public QqbyItem() {
		super(0, HskgzsczModSounds.REGISTRY.get(new ResourceLocation("hskgzscz:qby")),
				new Item.Properties().tab(HskgzsczModTabs.TAB_TTOTEYEXIAOWEI).stacksTo(1).rarity(Rarity.RARE));
	}
}
