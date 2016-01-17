package me.lordethan.cryton.module.modules;

import org.darkstorm.minecraft.gui.component.BoundedRangeComponent.ValueDisplay;
import org.lwjgl.input.Keyboard;

import com.ibm.icu.impl.ICUService.Key;

import me.lordethan.cryton.module.Category;
import me.lordethan.cryton.module.Module;
import me.lordethan.cryton.values.Value;

public class Timer extends Module {

	Value TimerSpeed = new Value("Timer Speed", 1, 1, 5, ValueDisplay.INTEGER);

	public Timer() {
		super("Timer", Keyboard.KEY_M, 0xffffffff, Category.WORLD);
	}

	public void onUpdate() {
		if (this.getState()) {
			net.minecraft.util.Timer.timerSpeed = (float) TimerSpeed.getValue();
		}
	}
	
	public void onDisable(){
		net.minecraft.util.Timer.timerSpeed = 1.0f;
	}

}
