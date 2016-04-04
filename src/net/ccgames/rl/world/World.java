package net.ccgames.rl.world;

import net.ccgames.rl.tiles.Tile;

/**
 * The world that will be displayed to the player. Can be instantiated as levels
 * @author Cody - CCGames
 *
 */
public class World
{
	//A world will be built of tiles (2d? 3d?)
	private Tile[][] world;
		private int width;
		private int height;
	
	public World(Tile[][] world)
	{
		this.world = world;
		this.width = world.length;
		this.height = world[0].length;
	}
	
	public Tile[][] getWorld()
	{
		return world;
	}
	
	public int getWorldWidth()
	{
		return width;
	}
	
	public int getWorldHeight()
	{
		return height;
	}
	
	public Tile getTileAtCoordinates(int x, int y)
	{
		return world[x][y];
	}
}
