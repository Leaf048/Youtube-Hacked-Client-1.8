package me.lordethan.cryton.module.modules;

import org.darkstorm.minecraft.gui.component.BoundedRangeComponent.ValueDisplay;

import me.lordethan.cryton.module.Category;
import me.lordethan.cryton.module.Module;
import me.lordethan.cryton.utils.Wrapper;
import me.lordethan.cryton.values.Value;

public class Step extends Module{
	
	Value stepHeight = new Value("Step Height", 1, 1, 5, ValueDisplay.INTEGER);

	public Step() {
		super("Step", Category.MOVMENT);
	}
	
	public void onUpdate(){
		if(this.getState()){
			Wrapper.mc.getMinecraft().thePlayer.stepHeight = (float) stepHeight.getValue();
		}else{
			Wrapper.mc.getMinecraft().thePlayer.stepHeight = 0.5f;
		}
	}

}
