package net.ccgames.rl.screen;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class ScreenExitProgram implements Screen
{
	private Screen previousScreen = this;
	
	public ScreenExitProgram(Screen prev)
	{
		this.previousScreen = prev;
	}

	@Override
	public void displayOutput(AsciiPanel terminal)
	{
		terminal.writeCenter("Are you sure you want to exit the program?", 10);
		terminal.writeCenter("[ESCAPE] - No, I don't want to exit.", 30);
		terminal.writeCenter("[ENTER]  - Yes, I want to exit!     ", 32);
	}

	@Override
	public Screen respondToUserInput(KeyEvent ke)
	{
		switch(ke.getKeyCode())
		{
		case KeyEvent.VK_ESCAPE:
			return previousScreen;
		case KeyEvent.VK_ENTER:
			System.exit(0);
		default:
			return this;
		}
	}
	
}
