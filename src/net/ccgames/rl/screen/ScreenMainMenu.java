package net.ccgames.rl.screen;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class ScreenMainMenu implements Screen
{

	@Override
	public void displayOutput(AsciiPanel terminal)
	{
		terminal.write("Welcome to SimpleRL", 3, 1);
		terminal.write("Menu choices are selected with the keys denoted in [ ]", 3, 2);
		terminal.write("[N] - New Game", 50, 25);
		terminal.write("[L] - Load Game", 50, 27);
		terminal.write("[O] - Options", 50, 29);
		terminal.write("[C] - Credits, Licenses and Attributions", 50, 31);
		terminal.write("[E] - Exit Program", 50, 33);
	}

	@Override
	public Screen respondToUserInput(KeyEvent ke)
	{
		switch(ke.getKeyCode())
		{
		case KeyEvent.VK_E:
			return new ScreenExitProgram(this);
		case KeyEvent.VK_C:
			return new ScreenCredits();
		case KeyEvent.VK_O:
			return new ScreenOptions(this);
		case KeyEvent.VK_N:
			return new ScreenNewGame();
		default:
			return this;
		}
	}

}
