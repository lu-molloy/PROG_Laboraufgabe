package org.lu.model.level;

import java.util.ArrayList;
import java.util.List;

public class Level
{
    /*
    Enthaelt Raeume, Gegnerlisten, Boss, Belohnungen
     */

    private int levelNumber;
    private List<Room> rooms;
    private Room startRoom;
    private Room bossRoom;

    public Level (int levelNumber)
    {
        this.levelNumber = levelNumber;
        this.rooms = new ArrayList<Room>();
    }

    public void addRoom (Room room)
    {
        rooms.add(room);
        if (startRoom == null)
        {
            startRoom = room;
        }
    }

    // Getter und Setter

    public int getLevelNumber ()
    {
        return levelNumber;
    }

    public void setLevelNumber (int levelNumber)
    {
        this.levelNumber = levelNumber;
    }

    public List<Room> getRooms ()
    {
        return rooms;
    }

    public void setRooms (List<Room> rooms)
    {
        this.rooms = rooms;
    }

    public Room getStartRoom ()
    {
        return startRoom;
    }

    public void setStartRoom (Room startRoom)
    {
        this.startRoom = startRoom;
    }

    public Room getBossRoom ()
    {
        return bossRoom;
    }

    public void setBossRoom (Room bossRoom)
    {
        this.bossRoom = bossRoom;
    }
}
