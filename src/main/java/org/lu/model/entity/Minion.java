package org.lu.model.entity;

import org.lu.model.items.Artifact;
import org.lu.model.items.Weapon;

import java.util.List;

public class Minion extends Entity
{
    /*
    Besitzer (Player/DM), Spezialfaehigkeiten
     */

    private Entity owner;
    private boolean canActImmediately; // fuer "Haste"-aehnliche Mechaniken
    private int range; // fuer Fernangriffe

    public Minion (String name, int hp, int maxHp, int attack, int defense, int movement, int x, int y, Weapon weapon, List<Artifact> artifacts, Entity owner, boolean canActImmediately, int range)
    {
        super(name, hp, maxHp, attack, defense, movement, x, y, weapon, artifacts);
        this.owner = owner;
        this.canActImmediately = canActImmediately;
        this.range = range;
    }

    public void attack (Entity target)
    {

    }

    public boolean isAdjacentTo (Entity e)
    {

    }

    public boolean inInRange (Entity e)
    {

    }

    // Getter und Setter

    public Entity getOwner ()
    {
        return owner;
    }

    public void setOwner (Entity owner)
    {
        this.owner = owner;
    }

    public boolean isCanActImmediately ()
    {
        return canActImmediately;
    }

    public void setCanActImmediately (boolean canActImmediately)
    {
        this.canActImmediately = canActImmediately;
    }

    public int getRange ()
    {
        return range;
    }

    public void setRange (int range)
    {
        this.range = range;
    }
}
