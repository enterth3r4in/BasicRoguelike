package net.ccgames.rl.screen;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class ScreenPlayGame implements Screen
{

	@Override
	public void displayOutput(AsciiPanel terminal)
	{
		
	}

	@Override
	public Screen respondToUserInput(KeyEvent ke)
	{
		switch(ke.getKeyCode())
		{
		
		default:
			return this;
		}
	}

}
