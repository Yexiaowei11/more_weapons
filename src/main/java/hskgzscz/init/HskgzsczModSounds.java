
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package hskgzscz.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HskgzsczModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("hskgzscz", "flower_dance"), new SoundEvent(new ResourceLocation("hskgzscz", "flower_dance")));
		REGISTRY.put(new ResourceLocation("hskgzscz", "a_comme"), new SoundEvent(new ResourceLocation("hskgzscz", "a_comme")));
		REGISTRY.put(new ResourceLocation("hskgzscz", "athousand"), new SoundEvent(new ResourceLocation("hskgzscz", "athousand")));
		REGISTRY.put(new ResourceLocation("hskgzscz", "bad_apple"), new SoundEvent(new ResourceLocation("hskgzscz", "bad_apple")));
		REGISTRY.put(new ResourceLocation("hskgzscz", "chinax"), new SoundEvent(new ResourceLocation("hskgzscz", "chinax")));
		REGISTRY.put(new ResourceLocation("hskgzscz", "kanong"), new SoundEvent(new ResourceLocation("hskgzscz", "kanong")));
		REGISTRY.put(new ResourceLocation("hskgzscz", "qby"), new SoundEvent(new ResourceLocation("hskgzscz", "qby")));
		REGISTRY.put(new ResourceLocation("hskgzscz", "qsx"), new SoundEvent(new ResourceLocation("hskgzscz", "qsx")));
		REGISTRY.put(new ResourceLocation("hskgzscz", "undertale"), new SoundEvent(new ResourceLocation("hskgzscz", "undertale")));
		REGISTRY.put(new ResourceLocation("hskgzscz", "tos"), new SoundEvent(new ResourceLocation("hskgzscz", "tos")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
