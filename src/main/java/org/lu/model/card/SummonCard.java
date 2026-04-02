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
