package me.lordethan.cryton.module.modules;

import org.lwjgl.input.Keyboard;

import me.lordethan.cryton.module.Category;
import me.lordethan.cryton.module.Module;

public class ChestEsp extends Module{
	
	public ChestEsp()
	{
		super("ChestEsp", Keyboard.KEY_Y, Category.RENDER);
	}

}
