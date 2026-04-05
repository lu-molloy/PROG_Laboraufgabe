package org.lu.model.level;

import org.lu.model.monster.Monster;

import java.util.ArrayList;
import java.util.List;

public class Room
{
    /*
    Typ, Monsterliste, Ereignisse
     */

    private String id;
    private RoomType type;
    private List<Monster> monsters;

    public Room(String id, RoomType type)
    {
        this.id = id;
        this.type = type;
        this.monsters = new ArrayList<Monster>();
    }

    public void addMonster (Monster m)
    {
        monsters.add(m);
    }

    public boolean isCleared ()
    {
        // true, wenn keine Monster mehr
        return monsters.isEmpty();
    }

    // Getter und Setter

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public RoomType getType ()
    {
        return type;
    }

    public void setType (RoomType type)
    {
        this.type = type;
    }

    public List<Monster> getMonsters ()
    {
        return monsters;
    }

    public void setMonsters (List<Monster> monsters)
    {
        this.monsters = monsters;
    }
}
