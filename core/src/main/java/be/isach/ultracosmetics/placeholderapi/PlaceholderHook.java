package be.isach.ultracosmetics.placeholderapi;

import be.isach.ultracosmetics.UltraCosmetics;
import be.isach.ultracosmetics.cosmetics.suits.ArmorSlot;
import be.isach.ultracosmetics.player.UltraPlayer;
import me.clip.placeholderapi.external.EZPlaceholderHook;
import org.bukkit.entity.Player;

/**
 * PlaceholderAPI hook.
 *
 * @author RadBuilder
 * @since 2.5
 */
public class PlaceholderHook extends EZPlaceholderHook {

	private UltraCosmetics ultraCosmetics;

	public PlaceholderHook(UltraCosmetics ultraCosmetics) {
		super(ultraCosmetics, "ultracosmetics");
		this.ultraCosmetics = ultraCosmetics;
	}

	@Override
	public String onPlaceholderRequest(Player player, String identifier) {
		UltraPlayer ultraPlayer = ultraCosmetics.getPlayerManager().getUltraPlayer(player);
		switch (identifier) {
			// Current cosmetics
			case "current_gadget":
				return ultraPlayer.getCurrentGadget().getType().getName();
			case "current_mount":
				return ultraPlayer.getCurrentMount().getType().getName();
			case "current_particleeffect":
				return ultraPlayer.getCurrentParticleEffect().getType().getName();
			case "current_pet":
				return ultraPlayer.getCurrentPet().getType().getName();
			case "current_morph":
				return ultraPlayer.getCurrentMorph().getType().getName();
			case "current_hat":
				return ultraPlayer.getCurrentHat().getType().getName();
			case "current_emote":
				return ultraPlayer.getCurrentEmote().getType().getName();
			case "current_suit_helmet":
				return ultraPlayer.getSuit(ArmorSlot.HELMET).getType().getName(ArmorSlot.HELMET);
			case "current_suit_chestplate":
				return ultraPlayer.getSuit(ArmorSlot.CHESTPLATE).getType().getName(ArmorSlot.CHESTPLATE);
			case "current_suit_leggings":
				return ultraPlayer.getSuit(ArmorSlot.LEGGINGS).getType().getName(ArmorSlot.LEGGINGS);
			case "current_suit_boots":
				return ultraPlayer.getSuit(ArmorSlot.BOOTS).getType().getName(ArmorSlot.BOOTS);

			// Balance, keys, and user-specific settings
			case "balance":
				return "" + ultraPlayer.getBalance();
			case "keys":
				return "" + ultraPlayer.getKeys();
			case "gadgets_enabled":
				return "" + ultraPlayer.hasGadgetsEnabled();
			case "morph_selfview":
				return "" + ultraPlayer.canSeeSelfMorph();
			case "treasurechest_active":
				return "" + (ultraPlayer.getCurrentTreasureChest() != null);

			// Gadget ammo
			case "ammo_batblaster":
				return "" + ultraPlayer.getAmmo("BatBlaster");
			case "ammo_chickenator":
				return "" + ultraPlayer.getAmmo("Chickenator");
			case "ammo_colorbomb":
				return "" + ultraPlayer.getAmmo("ColorBomb");
			case "ammo_discoball":
				return "" + ultraPlayer.getAmmo("DiscoBall");
			case "ammo_etherealpearl":
				return "" + ultraPlayer.getAmmo("EtherealPearl");
			case "ammo_fleshhook":
				return "" + ultraPlayer.getAmmo("FleshHook");
			case "ammo_melonthrower":
				return "" + ultraPlayer.getAmmo("MelonThrower");
			case "ammo_blizzardblaster":
				return "" + ultraPlayer.getAmmo("BlizzardBlaster");
			case "ammo_portalgun":
				return "" + ultraPlayer.getAmmo("PortalGun");
			case "ammo_explosivesheep":
				return "" + ultraPlayer.getAmmo("ExplosiveSheep");
			case "ammo_paintballgun":
				return "" + ultraPlayer.getAmmo("PaintballGun");
			case "ammo_thorhammer":
				return "" + ultraPlayer.getAmmo("ThorHammer");
			case "ammo_antigravity":
				return "" + ultraPlayer.getAmmo("AntiGravity");
			case "ammo_smashdown":
				return "" + ultraPlayer.getAmmo("SmashDown");
			case "ammo_rocket":
				return "" + ultraPlayer.getAmmo("Rocket");
			case "ammo_blackhole":
				return "" + ultraPlayer.getAmmo("BlackHole");
			case "ammo_tsunami":
				return "" + ultraPlayer.getAmmo("Tsunami");
			case "ammo_tnt":
				return "" + ultraPlayer.getAmmo("TNT");
			case "ammo_fungun":
				return "" + ultraPlayer.getAmmo("FunGun");
			case "ammo_parachute":
				return "" + ultraPlayer.getAmmo("Parachute");
			case "ammo_quakegun":
				return "" + ultraPlayer.getAmmo("QuakeGun");
			case "ammo_firework":
				return "" + ultraPlayer.getAmmo("Firework");
			case "ammo_christmastree":
				return "" + ultraPlayer.getAmmo("ChristmasTree");
			case "ammo_freezecannon":
				return "" + ultraPlayer.getAmmo("FreezeCannon");
			case "ammo_snowball":
				return "" + ultraPlayer.getAmmo("Snowball");
			case "ammo_partypopper":
				return "" + ultraPlayer.getAmmo("PartyPopper");
			case "ammo_trampoline":
				return "" + ultraPlayer.getAmmo("Trampoline");
		}
		return null;
	}
}
