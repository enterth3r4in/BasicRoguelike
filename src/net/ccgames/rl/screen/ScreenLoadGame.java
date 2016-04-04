package net.ccgames.rl.screen;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class ScreenLoadGame implements Screen
{
	private Screen previousScreen;
	
	public ScreenLoadGame(Screen prev)
	{
		this.previousScreen = prev;
	}
	
	@Override
	public void displayOutput(AsciiPanel terminal)
	{
		
	}

	@Override
	public Screen respondToUserInput(KeyEvent ke)
	{
		switch(ke.getKeyCode())
		{
		case KeyEvent.VK_ESCAPE:
			return previousScreen;
		}
		return this;
	}

}
