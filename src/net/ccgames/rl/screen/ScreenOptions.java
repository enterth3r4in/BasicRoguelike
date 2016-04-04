package net.ccgames.rl.screen;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;
import net.ccgames.rl.utility.MenuColoring;

/**
 * Options screen for game options and menu/text options
 * @author Cody Miller
 *
 */
public class ScreenOptions implements Screen
{
	private Screen previousScreen;

	/**
	 * Options can be called from outside of just the main menu, so previous screen is assigned to return.
	 * @param screen - The screen that directed to this menu
	 */
	public ScreenOptions(Screen screen)
	{
		previousScreen = screen;
	}
	
	@Override
	public void displayOutput(AsciiPanel terminal)
	{
		terminal.writeCenter("-- -- -- OPTIONS -- -- --", 5);
		terminal.write("[L] - Change text color from list", 10, 10);
		terminal.write("[C] - Change color from RGB values", 10, 12);
		terminal.write("[R] - Randomize menu color", 10, 14);
		terminal.writeCenter("[ESCAPE] - Return to previous screen", 35);
	}

	@Override
	public Screen respondToUserInput(KeyEvent ke)
	{
		switch(ke.getKeyCode())
		{
		case KeyEvent.VK_L:
			MenuColoring.changeMenuColorList();
			return this;
		case KeyEvent.VK_C:
			MenuColoring.changeMenuColorRGB();
			return this;
		case KeyEvent.VK_R:
			MenuColoring.randomizeMenuColor();
			return this;
		case KeyEvent.VK_ESCAPE:
			return previousScreen;
		default:
			return this;
		}
	}
	
}
