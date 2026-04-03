package org.lu.model.items;

public class Weapon
{
    /*
    Angriff, Reichweite, Spezialeffekte
     */

    private String name;
    private int attackBonus;
    private int range;
    private String description;

    public Weapon (String name, int attackBonus, int range, String description)
    {
        this.name = name;
        this.attackBonus = attackBonus;
        this.range = range;
        this.description = description;
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

    public int getAttackBonus ()
    {
        return attackBonus;
    }

    public void setAttackBonus (int attackBonus)
    {
        this.attackBonus = attackBonus;
    }

    public int getRange ()
    {
        return range;
    }

    public void setRange (int range)
    {
        this.range = range;
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
