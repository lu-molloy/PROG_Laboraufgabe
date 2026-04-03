package org.lu.model.card;

import org.lu.model.entity.Entity;
import org.lu.model.game.GameState;

/**
 * Erzeugt Minions.
 */
public class SummonCard extends Card
{
    private String minionName;
    private int minionHP;
    private int minionAttack;
    private int minionDefense;
    private int minionRange; // optional

    public SummonCard (String name, String description, int manaCost, String minionName, int minionHP, int minionAttack, int minionDefense, int minionRange)
    {
        super(name, description, manaCost);
        this.minionName = minionName;
        this.minionHP = minionHP;
        this.minionAttack = minionAttack;
        this.minionDefense = minionDefense;
        this.minionRange = minionRange;
    }

    public void play (Entity caster, GameState state)
    {
        // Minion erzeugen
    }

    // Getter und Setter

    public String getMinionName ()
    {
        return minionName;
    }

    public void setMinionName (String minionName)
    {
        this.minionName = minionName;
    }

    public int getMinionHP ()
    {
        return minionHP;
    }

    public void setMinionHP (int minionHP)
    {
        this.minionHP = minionHP;
    }

    public int getMinionAttack ()
    {
        return minionAttack;
    }

    public void setMinionAttack (int minionAttack)
    {
        this.minionAttack = minionAttack;
    }

    public int getMinionDefense ()
    {
        return minionDefense;
    }

    public void setMinionDefense (int minionDefense)
    {
        this.minionDefense = minionDefense;
    }

    public int getMinionRange ()
    {
        return minionRange;
    }

    public void setMinionRange (int minionRange)
    {
        this.minionRange = minionRange;
    }
}
