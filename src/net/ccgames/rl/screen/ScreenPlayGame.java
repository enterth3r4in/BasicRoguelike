package net.ccgames.rl.screen;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;
import net.ccgames.rl.tiles.TileColoring;
import net.ccgames.rl.world.World;
import net.ccgames.rl.world.gen.WorldBuilder;

public class ScreenPlayGame implements Screen
{
	private World world;
	private int screenWidth;
	private int screenHeight;
	private int playerX = screenWidth / 2 + 1;
	private int playerY = screenHeight / 2 + 1;
	
	public ScreenPlayGame()
	{
		screenWidth = 110;
		screenHeight = 35;
		createWorld();
	}
	
	public void createWorld()
	{
		world = new WorldBuilder(screenWidth, screenHeight).fillAndGenFirstRoom().buildWorld();
	}
	
	@Override
	public void displayOutput(AsciiPanel terminal)
	{
		displayTiles(terminal);
		terminal.write('X', playerX, playerY, TileColoring.PLAYER);
	}
	
	public void displayTiles(AsciiPanel terminal)
	{
		for(int x = 0; x < screenWidth; x++)
		{
			for(int y = 0; y < screenHeight; y++)
			{
				System.out.println(world.getGlyph(x, y));
				terminal.write(world.getTileAtCoordinates(x, y).getTileGlyph(), x, y, world.getTileAtCoordinates(x, y).getTileColor());
			}
		}
	}
	
	public void move(int dx, int dy)
	{
		playerX += dx;
		playerY += dy;
	}

	@Override
	public Screen respondToUserInput(KeyEvent ke)
	{
		switch(ke.getKeyCode())
		{
		case KeyEvent.VK_UP:
		case KeyEvent.VK_NUMPAD8:
		case KeyEvent.VK_W: move(0, -1); break;
		case KeyEvent.VK_DOWN:
		case KeyEvent.VK_NUMPAD2:
		case KeyEvent.VK_S: move(0, 1); break;
		case KeyEvent.VK_LEFT:
		case KeyEvent.VK_NUMPAD4:
		case KeyEvent.VK_A: move(-1, 0); break;
		case KeyEvent.VK_RIGHT:
		case KeyEvent.VK_NUMPAD6:
		case KeyEvent.VK_D: move(1, 0); break;
		case KeyEvent.VK_ESCAPE:
			return new ScreenOptions(this);
		
		}
		return this;
	}

}
