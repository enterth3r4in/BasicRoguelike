package net.ccgames.rl.tiles;

import java.awt.Color;

/**
 * Each tile has several guaranteed attributes including the tileID, the glyph, the color
 * the internal name(used locally for referencing) and the display name for examining tiles
 * @author Cody - CCGames
 *
 */
public class Tile
{
	private int tileID;
	private String internalName;
	private char tileGlyph;
	private Color tileColor;
	private String displayName;
	
	/**
	 * All tiles must give at bare minimum these. Generic Tiles are what are instantiated so 
	 * the Tile class is never directly instantiated
	 * @param tileID
	 * @param tileGlyph
	 * @param tileColor
	 * @param internalName
	 * @param displayName
	 */
	public Tile(int tileID, char tileGlyph, Color tileColor, String internalName, String displayName)
	{
		this.tileID = tileID;
		this.tileGlyph = tileGlyph;
		this.tileColor = tileColor;
		this.internalName = internalName;
		this.displayName = displayName;
	}
	
//	//Only method which directly returns tiles
//	public Tile getTileByID(int tileID)
//	{
//		switch(tileID)
//		{
//		case 0:
//			return WALL;
//		case 1:
//			return FLOOR;
//		default:
//			return WALL;
//		}
//	}
//	
//	//Gets the tile ID by the internal name to be passed to getTileByID(int tileID)
//	public int getTileIDByInternalName(String internalName)
//	{
//		switch(internalName)
//		{
//		case "tileWall":
//			return WALL.tileID;
//		case "tileFloor":
//			return FLOOR.tileID;
//		default:
//			return WALL.tileID;
//		}
//	}
//	
//	//Get method for getting the glyph of a tile by the tile ID
//	public char getTileGlyphByID(int tileID)
//	{ return getTileByID(tileID).getTileGlyph(); }
//	
//	//Get method for getting the glyph of a tile by the internal name
//	public char getTileGlyphByInternalName(String internalName)
//	{ return getTileByID(getTileIDByInternalName(internalName)).getTileGlyph(); }
//	
//	//Get method for getting the glyph of a tile by the internal name
//	public Color getTileColorByID(int tileID)
//	{ return getTileByID(tileID).getTileColor(); }
//	
//	//Get method for getting the tile color by the internal name
//	public Color getTileColorByInternalName(String internalName) 
//	{ return getTileByID(getTileIDByInternalName(internalName)).getTileColor(); }
//	
//	//Get method for getting the internal name from the ID (obviously no method for getting internal name by internal name. What?
//	public String getInternalNameByID(int tileID)
//	{ return getTileByID(tileID).getInternalName(); }
//	
//	//Get method for getting the display name from the ID
//	public String getDisplayNameByID(int tileID)
//	{ return getTileByID(tileID).getDisplayName(); }
//	
//	//Get method for getting the display name by internal name
//	public String getDisplayNameByInternalName(String internalName)
//	{ return getTileByID(getTileIDByInternalName(internalName)).getDisplayName(); }
	
	/**
	 * Uses the tile id to get the internal name. Use the tile sheet reference
	 * for tile id to insure no mis-compares
	 * @param tileID - Use tile sheet for tile id reference
	 * @return - Internal Name
	 */
	public String getInternalNameByTileID(int tileID)
	{
		switch(tileID)
		{
		case TileSheet.WALL_ID:
			return TileSheet.WALL_INTERNAL;
		case TileSheet.FLOOR_ID:
			return TileSheet.FLOOR_INTERNAL;
		default:
			return TileSheet.WALL_INTERNAL;
		}
	}
	
	/**
	 * Uses the internal name provided to get the tileID.
	 * Always use the tile sheet reference for internal name to insure no mis-compares
	 * @param internalName - Use tile sheet reference name
	 * @return - Tile ID
	 */
	public int getTileIDByInternalName(String internalName)
	{
		switch(internalName)
		{
		case TileSheet.WALL_INTERNAL:
			return TileSheet.WALL_ID;
		case TileSheet.FLOOR_INTERNAL:
			return TileSheet.FLOOR_ID;
		default:
			return TileSheet.WALL_ID;
		}
	}
	
	//Standard get methods, but private for accessing only from the getByInternal or getByID
	public int getTileID() { return tileID; }
	public char getTileGlyph() { return tileGlyph; }
	public Color getTileColor() { return tileColor; }
	public String getInternalName() { return internalName; }
	public String getDisplayName() { return displayName; }
	
	//Generic Tiles
	public static final Tile WALL = new TileGeneric(0, '#', TileColoring.WALL, "tileWall", "Wall");
	public static final Tile FLOOR = new TileGeneric(1, '.', TileColoring.FLOOR, "tileFloor", "Floor");
	public static final Tile BOUNDS = new TileGeneric(-1, 'X', TileColoring.BOUNDS, "tileBounds", "BOUNDS");
	
	//Entity Tiles
	
	
	
}
