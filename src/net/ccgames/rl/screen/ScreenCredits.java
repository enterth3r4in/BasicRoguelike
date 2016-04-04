package net.ccgames.rl.screen;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class ScreenCredits implements Screen
{

	@Override
	public void displayOutput(AsciiPanel terminal)
	{
		terminal.writeCenter("-- -- -- Credits -- -- --", 5);
		terminal.write("Built in Java using Eclipse IDEs", 10, 10);
		terminal.write("Uses AsciiPanel library by trystan", 10, 12);
		terminal.write("Code written entirely by Cody Miller", 10, 14);
		terminal.write("Sounds created using SFXR", 60, 10);
		terminal.write("Using Java version 1.7", 60, 12);
		terminal.writeCenter("[ESCAPE] - Return to main menu", 35);
	}

	@Override
	public Screen respondToUserInput(KeyEvent ke)
	{
		switch(ke.getKeyCode())
		{
		case KeyEvent.VK_ESCAPE:
			return new ScreenMainMenu();
		default:
			return this;
		}
	}

}
