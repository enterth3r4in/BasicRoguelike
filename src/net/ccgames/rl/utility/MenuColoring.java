package net.ccgames.rl.utility;

import java.awt.Color;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;

/**
 * Used to recolor the menu text from the options menu. Highly reusable class
 * @author cm185181
 *
 */
public class MenuColoring
{
	/**
	 * menuColor that all text will be colored with. public and static to allow ease of access
	 */
	public static Color menuColor = new Color(255, 255, 255);
	
	private static String[] choices = {"White", "Dark Grey", "Grey", "Light Grey", "Dark Red", "Red", "Light Red",
			"Dark Green", "Green", "Light Green", "Dark Blue", "Blue", "Light Blue", "Dark Purple", "Purple", "Light Purple",
			"Dark Yellow", "Yellow", "Light Yellow", "Dark Orange", "Orange", "Light Orange", "Dark Brown", "Brown", "Light Brown"};
	
	
	/**
	 * Changes the menu color through a standard (r,g,b) color
	 * @param r - Red value
	 * @param g - Green value
	 * @param b - Blue value
	 */
	public static void changeMenuColorRGB()
	{
		int r = 255, g = 255, b = 255;
		do
		{
			r = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number 0-255 for the red value.", "Red", JOptionPane.QUESTION_MESSAGE));
			g = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number 0-255 for the green value.", "Green", JOptionPane.QUESTION_MESSAGE));
			b = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number 0-255 for the blue value.", "Blue", JOptionPane.QUESTION_MESSAGE));
		}while(!isValidColor(r) && !isValidColor(g) && !isValidColor(b));
		
		menuColor = new Color(r, g, b);
	}
	
	private static boolean isValidColor(int toCheck)
	{
		if(toCheck < 0 || toCheck > 255)
			return false;
		else
			return true;
	}
	
	/**
	 * UNUSED PRESENTLY, DO NOT DELETE
	 */
//	public static void changeMenuColor(Color color)
//	{
//		menuColor = color;
//	}
	
	/**
	 * List version to change menu color
	 */
	public static void changeMenuColorList()
	{
		String input = (String) JOptionPane.showInputDialog(null, "Please select a color.", "Color choice", JOptionPane.QUESTION_MESSAGE,
				null, choices, choices[0]);
		menuColor = getColorFromString(input);
	}
	
	
	 /*
	  * choices = {"White", "Dark Grey", "Grey", "Light Grey", "Dark Red", "Red", "Light Red",
			"Dark Green", "Green", "Light Green", "Dark Blue", "Blue", "Light Blue", "Dark Purple", "Purple", "Light Purple",
			"Dark Yellow", "Yellow", "Light Yellow", "Dark Orange", "Orange", "Light Orange", "Dark Brown", "Brown", "Light Brown"};
	  */
	/**
	 * 
	 * @param input
	 * @return
	 */
	private static Color getColorFromString(String input)
	{
		switch(input.toLowerCase())
		{
		case "dark red":
			return new Color(150, 0, 0);
		case "red":
			return new Color(200, 0, 0);
		case "light red":
			return new Color(255, 0, 0);
		case "white":
			return new Color(255, 255, 255);
		case "dark grey":
			return new Color(150, 150, 150);
		case "grey":
			return new Color(200, 200, 200);
		case "light grey":
			return new Color(225, 225, 225);
		case "dark green":
			return new Color(0, 150, 0);
		case "green":
			return new Color(0, 200, 0);
		case "light green":
			return new Color(0, 255, 0);
		case "dark blue":
			return new Color(0, 0, 150);
		case "blue":
			return new Color(0, 0, 200);
		case "light blue":
			return new Color(0, 0, 255);
		case "dark purple":
			return new Color(150, 0, 150);
		case "purple":
			return new Color(200, 0, 200);
		case "light purple":
			return new Color(255, 0, 255);
		case "dark yellow":
			return new Color(150, 150, 0);
		case "yellow":
			return new Color(200, 200, 0);
		case "light yellow":
			return new Color(255, 255, 0);
		case "dark orange":
			return new Color(225, 150, 0);
		case "orange":
			return new Color(240, 160, 0);
		case "light orange":
			return new Color(255, 170, 0);
		case "light brown":
			return new Color(190, 128, 0);
		case "brown":
			return new Color(166, 111, 0);
		case "dark brown":
			return new Color(128, 85, 0);
		default:
			return new Color(255, 255, 255);
		}
	}
	
	/*
	 * choices = {"White", "Dark Grey", "Grey", "Light Grey", "Dark Red", "Red", "Light Red",
			"Dark Green", "Green", "Light Green", "Dark Blue", "Blue", "Light Blue", "Dark Purple", "Purple", "Light Purple",
			"Dark Yellow", "Yellow", "Light Yellow", "Dark Orange", "Orange", "Light Orange", "Dark Brown", "Brown", "Light Brown"};
	 */
	
	/**
	 * 
	 */
	public static void randomizeMenuColor()
	{
		menuColor = new Color(ThreadLocalRandom.current().nextInt(0, 256),
				ThreadLocalRandom.current().nextInt(0, 256),
				ThreadLocalRandom.current().nextInt(0, 256));
	}
}
