package net.ccgames.rl.world.gen;

import net.ccgames.rl.tiles.Tile;
import net.ccgames.rl.world.World;

public class WorldBuilder
{
	private Tile[][] tiles;
	private int width;
	private int height;
	
	public WorldBuilder(int width, int height)
	{
		this.width = width;
		this.height = height;
		this.tiles = new Tile[width][height];
	}
	
	public World buildWorld()
	{
		return new World(tiles);
	}
	
	public WorldBuilder fillAndGenFirstRoom()
	{
		fillWorldWithWalls().fillRectangle(width / 2, height / 2, 10, 10, Tile.FLOOR);
		return this;
	}
	
	/**
	 * Fills world with walls
	 * @return - fluent return
	 */
	public WorldBuilder fillWorldWithWalls()
	{
		for(int x = 0; x < width; x++)
		{
			for(int y = 0; y < height; y++)
			{
				tiles[x][y] = Tile.WALL;
			}
		}
		return this;
	}
	
	/**
	 * Fills a rectangle from the top left corner to the width and height of the specified tile type
	 * @param x - top left x position
	 * @param y - top left y position
	 * @param width - width to draw
	 * @param height - height to draw
	 * @param tileType - tile to fill with
	 * @return - fluent return
	 */
	public void fillRectangle(int xPos, int yPos, int width, int height, Tile tileType)
	{
		Tile[][] tiles2  = new Tile[this.width][this.height];
		for(int x = xPos; x < xPos + width; x++)
		{
			for(int y = yPos; y < yPos + height; y++)
			{
				tiles2[x][y] = tileType;
			}
		}
		tiles = tiles2;
	}
}
