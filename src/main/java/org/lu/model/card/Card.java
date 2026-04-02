package org.lu.model.card;

import org.lu.model.entity.Entity;
import org.lu.model.game.GameState;

public abstract class Card
{
    /*
    (abstract) Name, ManaCost, Beschreibung
     */

    private String name;
    private String description;
    private int manaCost;

    public abstract void play (Entity caster, GameState state);

    // Getter und Setter

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public int getManaCost ()
    {
        return manaCost;
    }

    public void setManaCost (int manaCost)
    {
        this.manaCost = manaCost;
    }
}
