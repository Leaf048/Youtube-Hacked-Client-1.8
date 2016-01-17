package me.lordethan.cryton.module.modules;

import me.lordethan.cryton.module.Category;
import me.lordethan.cryton.module.Module;
import me.lordethan.cryton.utils.Wrapper;
import me.lordethan.cryton.values.Value;

import org.darkstorm.minecraft.gui.component.BoundedRangeComponent.ValueDisplay;
import org.lwjgl.input.Keyboard;

public class Flight extends Module {
	
	Value flightSpeed = new Value("Flight Speed", 1, 1, 10, ValueDisplay.INTEGER);

	public Flight() {
		super("Flight", Keyboard.KEY_F, Category.PLAYER);
	}

	public void onUpdate() {
		if (!this.getState()) {
			return;
		}
		Wrapper.mc.thePlayer.capabilities.setFlySpeed((float) flightSpeed.getValue() / 10);
		Wrapper.mc.thePlayer.capabilities.isFlying = true;
	}

	public void onDisable() {
		Wrapper.mc.thePlayer.capabilities.isFlying = false;
	}

}
