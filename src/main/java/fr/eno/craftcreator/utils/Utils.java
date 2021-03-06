package fr.eno.craftcreator.utils;

import fr.eno.craftcreator.References;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.text.TranslationTextComponent;

/**
 * 
 * @author Eno_gamer10
 * 
 * @apiNote Class for call method with the smallest size possible
 *
 */
public class Utils
{
	static Minecraft mc = Minecraft.getInstance();
	
	/**
	 * call {@link References#getTranslate(String, Object...)}
	 * @see References#getTranslate(String, Object...)
	 * 
	 * @param path
	 * @param args
	 * @return The {@link TranslationTextComponent}
	 */
	public static TranslationTextComponent get(String path, Object... args)
	{
		return References.getTranslate(path, args);
	}
	
	/**
	 * call {@link References#getTranslate(String, Object...)} directly formatted to string
	 * @see References#getTranslate(String, Object...)
	 * 
	 * @param path
	 * @param args
	 * @return The formatted string from {@link TranslationTextComponent}
	 */
	public static String getS(String path, Object... args)
	{
		return References.getTranslate(path, args).getFormattedText();
	}
	
	/**
	 * call {@link FontRenderer#getStringWidth(String)}
	 * @see FontRenderer#getStringWidth(String)
	 * 
	 * @param str The string
	 * @return width of the given string
	 */
	public static int width(String str)
	{
		return mc.fontRenderer.getStringWidth(str);
	}
}