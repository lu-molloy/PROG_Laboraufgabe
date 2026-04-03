package org.lu.model.items;

import org.lu.model.entity.Entity;

import javax.naming.event.EventContext;

public class Talent
{
    /*
    Passive oder aktive Effekte
     */

    private String name;
    private String description;
    private TalentType type;
    private int value;

    public Talent (String name, String description, TalentType type, int value)
    {
        this.name = name;
        this.description = description;
        this.type = type;
        this.value = value;
    }

    public void apply (Entity e)
    {

    }

    public void trigger (Entity e)
    {
        // optional mit EventContext, je nach Mechanik
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

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public TalentType getType ()
    {
        return type;
    }

    public void setType (TalentType type)
    {
        this.type = type;
    }

    public int getValue ()
    {
        return value;
    }

    public void setValue (int value)
    {
        this.value = value;
    }
}
