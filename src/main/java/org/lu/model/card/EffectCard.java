package org.lu.model.card;

import org.lu.model.entity.Entity;
import org.lu.model.game.GameState;

/**
 * Fuehrt Effekte aus (Buffs, Debuffs, Heilung etc.).
 */
public class EffectCard extends Card
{
    private int value; // zB Heilung, Buff-Staerke, Schaden

    private EffectType type;

    public EffectCard (String name, String description, int manaCost, int value, EffectType type)
    {
        super(name, description, manaCost);
        this.value = value;
        this.type = type;
    }

    public void play (Entity caster, GameState state)
    {
        // fuehrt den Effekt aus
    }

    // Getter und Setter

    public int getValue ()
    {
        return value;
    }

    public void setValue (int value)
    {
        this.value = value;
    }

    public EffectType getType ()
    {
        return type;
    }

    public void setType (EffectType type)
    {
        this.type = type;
    }
}
