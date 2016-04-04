package net.ccgames.rl.tiles;

/**
 * Entire Reference sheet of UNCHANGING tile information. If it changes, it doesn't go here
 * The tile itself can change, and if it does, it pulls all the new attributes. 
 * Tiles change, attributes of each type of tile in here do not
 * 
 * E.g. Tile glyphs do not go here because they are technically changeable. One level might look one way, the next level might
 * have completely different glyphs for wall/floor/etc
 * 
 * Color doesn't go here because Color has its own reference class
 * @author Cody - CCGames
 *
 */
public class TileSheet
{
	//Tile ID
	public static final int WALL_ID = 0;
	public static final int FLOOR_ID = 1;
	
	//Internal Name
	public static final String WALL_INTERNAL = "tileWall";
	public static final String FLOOR_INTERNAL = "tileFloor";
	
	//Display Name
	public static final String WALL_DISPLAY = "Wall";
	public static final String FLOOR_DISPLAY = "Floor";
}
