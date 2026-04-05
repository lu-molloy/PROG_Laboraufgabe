package org.lu.model.entity;

import org.lu.model.items.Artifact;
import org.lu.model.items.Weapon;
import org.lu.model.map.DungeonMap;
import org.lu.util.Direction;

import java.util.List;

public abstract class Entity
{
    /*
    (abstract) Position, HP, Attack, Defense, Movement
     */

    private String name;
    private int hp;
    private int maxHp;
    private int attack;
    private int defense;
    private int movement;
    private int x;
    private int y;
    private Weapon weapon;
    private List<Artifact> artifacts;

    public Entity(String name, int hp, int maxHp, int attack, int defense,
                  int movement, int x, int y, Weapon weapon, List<Artifact> artifacts)
    {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.attack = attack;
        this.defense = defense;
        this.movement = movement;
        this.x = x;
        this.y = y;
        this.weapon = weapon;
        this.artifacts = artifacts;
    }

    public boolean isAlive ()
    {
        return hp > 0;
    }

    public void takeDamage (int amount)
    {

    }

    public void heal (int amount)
    {

    }

    public void move (Direction dir, DungeonMap map)
    {
        int newX = x;
        int newY = y;

        switch (dir)
        {
            case NORTH:
                newY--;
                break;

            case SOUTH:
                newY++;
                break;

            case WEST:
                newX--;
                break;

            case EAST:
                newX++;
                break;
        }

        if (map.isInside(newX, newY) && map.getTile(newX, newY).isWalkable())
        {
            this.x = newX;
            this.y = newY;
        }
    }

    public int getAttackValue ()
    {
        // beruecksichtigt Waffe, Artefakte, Talente
        return 0;
    }

    public int getDefenseValue ()
    {
        return 0;
    }

    // Getter und Setter

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public int getHp ()
    {
        return hp;
    }

    public void setHp (int hp)
    {
        this.hp = hp;
    }

    public int getMaxHp ()
    {
        return maxHp;
    }

    public void setMaxHp (int maxHp)
    {
        this.maxHp = maxHp;
    }

    public int getAttack ()
    {
        return attack;
    }

    public void setAttack (int attack)
    {
        this.attack = attack;
    }

    public int getDefense ()
    {
        return defense;
    }

    public void setDefense (int defense)
    {
        this.defense = defense;
    }

    public int getMovement ()
    {
        return movement;
    }

    public void setMovement (int movement)
    {
        this.movement = movement;
    }

    public int getX ()
    {
        return x;
    }

    public void setX (int x)
    {
        this.x = x;
    }

    public int getY ()
    {
        return y;
    }

    public void setY (int y)
    {
        this.y = y;
    }

    public Weapon getWeapon ()
    {
        return weapon;
    }

    public void setWeapon (Weapon weapon)
    {
        this.weapon = weapon;
    }

    public List<Artifact> getArtifacts ()
    {
        return artifacts;
    }

    public void setArtifacts (List<Artifact> artifacts)
    {
        this.artifacts = artifacts;
    }
}
