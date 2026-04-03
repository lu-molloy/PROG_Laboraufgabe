package org.lu.model.items;

public class Artifact
{
    /*
    Passive Boni
     */

    private String name;
    private int hpBonus;
    private int attackBonus;
    private int defenseBonus;
    private String description;

    // Getter und Setter

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public int getHpBonus ()
    {
        return hpBonus;
    }

    public void setHpBonus (int hpBonus)
    {
        this.hpBonus = hpBonus;
    }

    public int getAttackBonus ()
    {
        return attackBonus;
    }

    public void setAttackBonus (int attackBonus)
    {
        this.attackBonus = attackBonus;
    }

    public int getDefenseBonus ()
    {
        return defenseBonus;
    }

    public void setDefenseBonus (int defenseBonus)
    {
        this.defenseBonus = defenseBonus;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }
}
