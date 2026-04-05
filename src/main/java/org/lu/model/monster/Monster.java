package org.lu.model.monster;

import org.lu.model.entity.Entity;
import org.lu.model.items.Artifact;
import org.lu.model.items.Weapon;

import java.util.List;

public class Monster extends Entity
{
    /*
    Werte skalieren mit Level
     */

    private int level;
    private boolean boss;

    public Monster(String name, int hp, int maxHp, int attack, int defense,
                   int movement, int x, int y, Weapon weapon, List<Artifact> artifacts,
                   int level, boolean boss)
    {
        super(name, hp, maxHp, attack, defense, movement, x, y, weapon, artifacts);
        this.level = level;
        this.boss = boss;
    }

    // Getter und Setter

    public int getLevel ()
    {
        return level;
    }

    public void setLevel (int level)
    {
        this.level = level;
    }

    public boolean isBoss ()
    {
        return boss;
    }

    public void setBoss (boolean boss)
    {
        this.boss = boss;
    }
}
