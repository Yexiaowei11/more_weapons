
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package hskgzscz.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import hskgzscz.item.WqItem;
import hskgzscz.item.TosItem;
import hskgzscz.item.QqbyItem;
import hskgzscz.item.JXCDItem;
import hskgzscz.item.DddItem;
import hskgzscz.item.DdadaoItem;
import hskgzscz.item.CDNBPLItem;
import hskgzscz.item.CDItem;
import hskgzscz.item.BanZhuanItem;
import hskgzscz.item.AatmsItem;

import hskgzscz.HskgzsczMod;

public class HskgzsczModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HskgzsczMod.MODID);
	public static final RegistryObject<Item> WEAPONS_MORE = REGISTRY.register("weapons_more", () -> new CDNBPLItem());
	public static final RegistryObject<Item> TOS = REGISTRY.register("tos", () -> new TosItem());
	public static final RegistryObject<Item> QQBY = REGISTRY.register("qqby", () -> new QqbyItem());
	public static final RegistryObject<Item> AATMS = REGISTRY.register("aatms", () -> new AatmsItem());
	public static final RegistryObject<Item> WQ = REGISTRY.register("wq", () -> new WqItem());
	public static final RegistryObject<Item> DDD = REGISTRY.register("ddd", () -> new DddItem());
	public static final RegistryObject<Item> CD = REGISTRY.register("cd", () -> new CDItem());
	public static final RegistryObject<Item> BAN_ZHUAN = REGISTRY.register("ban_zhuan", () -> new BanZhuanItem());
	public static final RegistryObject<Item> DDADAO = REGISTRY.register("ddadao", () -> new DdadaoItem());
	public static final RegistryObject<Item> BQSHUJU = REGISTRY.register("bqshuju", () -> new BQSHUJUItem());
	public static final RegistryObject<Item> JXCD = REGISTRY.register("jxcd", () -> new JXCDItem());
}
