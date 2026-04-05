package org.lu.model.map;

import org.lu.model.entity.Entity;

public class DungeonMap
{
    /*
    2D-Array, Groesse klein/mittel/gross
     */

    private int width;
    private int height;
    private Tile[][] tiles;

    public DungeonMap (int width, int height)
    {
        this.width = width;
        this.height = height;
        this.tiles = new Tile[height][width];

        // einfache Karte: Rand = Wand, innen = Boden
        for (int y = 0; y < height; y++)
        {
            for (int x = 0; x < width; x++)
            {
                boolean border = (x == 0 || y == 0 || x == width - 1 || y == height - 1);

                if (border)
                {
                    tiles[y][x] = new Tile(TileType.WALL, false);
                }
                else
                {
                    tiles[y][x] = new Tile(TileType.FLOOR, true);
                }
            }
        }
    }

    public boolean isInside (int x, int y)
    {
        return x >= 0 && x < width && y >= 0 && y < height;
    }

    public Tile getTile (int x, int y)
    {
        return tiles[y][x];
    }

    public void setTile (int x, int y, Tile tile)
    {

    }

    public void placeEntity (Entity e)
    {
        // setzt TileType entsprechend
    }

    public void clearEntityPosition (int x, int y)
    {

    }

    //Getter und Setter

    public int getWidth ()
    {
        return width;
    }

    public void setWidth (int width)
    {
        this.width = width;
    }

    public int getHeight ()
    {
        return height;
    }

    public void setHeight (int height)
    {
        this.height = height;
    }

    public Tile[][] getTiles ()
    {
        return tiles;
    }

    public void setTiles (Tile[][] tiles)
    {
        this.tiles = tiles;
    }
}
