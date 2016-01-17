package me.lordethan.cryton.ui;

import java.util.List;

import org.lwjgl.opengl.Drawable;
import org.lwjgl.opengl.GL11;

import me.lordethan.cryton.Cryton;
import me.lordethan.cryton.module.Category;
import me.lordethan.cryton.module.Module;
import me.lordethan.cryton.utils.RenderUtils;
import me.lordethan.cryton.utils.Wrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.MathHelper;

public class GuiIngameHook{
	

	public static void StartHud(){
			Hud();
	}
	
	public static void Hud(){
		Wrapper.fu_default.drawString(Cryton.getClient_Name() + " Version:" + Cryton.getClient_Vesion(), 1, 1, 0xffffffff);
		renderArrayList();
		Cryton.theClient.getGuiManager().renderPinned();
		Cryton.theClient.getGuiManager().update();
	}
	
	private static void renderArrayList(){
		int yCount = 15;
		for(Module m : Cryton.theClient.moduleManager.activeModules){
			m.onRender();
			
			if(m.getState() && !m.isCategory(Category.GUI)){
				Wrapper.fu_default.drawString(m.getName(), 5, yCount, m.getColor());
				yCount +=10;
			}
		}
	}
	
	
    

}
