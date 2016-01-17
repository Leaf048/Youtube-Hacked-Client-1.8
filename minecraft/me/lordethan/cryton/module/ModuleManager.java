package me.lordethan.cryton.module;

import java.util.ArrayList;

import me.lordethan.cryton.module.modules.*;

public class ModuleManager {

	public static ArrayList<Module> activeModules = new ArrayList<Module>();

	public ModuleManager() {
		this.activeModules.add(new Sprint());
		this.activeModules.add(new FullBright());
		this.activeModules.add(new KillAura());
		this.activeModules.add(new Flight());
		this.activeModules.add(new Aimbot());
		this.activeModules.add(new FastPlace());
		this.activeModules.add(new TracerPlayer());
		this.activeModules.add(new ChestEsp());
		this.activeModules.add(new TracerMobs());
		this.activeModules.add(new OutlineEsp());
		this.activeModules.add(new ESPPlayer());
		this.activeModules.add(new ESPMobs());
		this.activeModules.add(new Step());
		this.activeModules.add(new Timer());
		this.activeModules.add(new Gui());
	}

	public static ArrayList<Module> getModules() {
		return activeModules;
	}

	public Module getModule(Class<? extends Module> clazz) {
		for (Module mod : getModules()) {
			if (mod.getClass() == clazz) {
				return mod;
			}
		}
		return null;
	}

}
