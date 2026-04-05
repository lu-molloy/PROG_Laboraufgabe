package org.lu.model.map;

public class Tile
{
    /*
    Typ: Raum, Kampf, Haendler, Boss, Treppe, Ereignis
     */

    private TileType type;
    private boolean walkable;

    public Tile (TileType type, boolean walkable)
    {
        this.type = type;
        this.walkable = walkable;
    }

    // Getter und Setter

    public TileType getType ()
    {
        return type;
    }

    public void setType (TileType type)
    {
        this.type = type;
    }

    public boolean isWalkable ()
    {
        return walkable;
    }

    public void setWalkable (boolean walkable)
    {
        this.walkable = walkable;
    }
}
