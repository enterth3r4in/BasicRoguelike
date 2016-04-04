package net.ccgames.rl.world.gen;

import net.ccgames.rl.tiles.Tile;
import net.ccgames.rl.world.World;

public class WorldBuilder
{
	private Tile[][] tiles;
	
	public WorldBuilder()
	{
		
	}
	
	public World buildWorld()
	{
		return new World(tiles);
	}
}
