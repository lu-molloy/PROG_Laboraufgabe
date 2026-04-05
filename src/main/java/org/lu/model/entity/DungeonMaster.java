package org.lu.model.entity;

import org.lu.model.deck.Deck;
import org.lu.model.deck.Hand;
import org.lu.model.items.Artifact;
import org.lu.model.items.Weapon;

import java.util.List;

public class DungeonMaster extends Entity
{
    /*
    Deck, Mana, eigene Mechaniken
     */

    private Deck deck;
    private Hand hand;
    private int mana;
    private int maxMana;

    public DungeonMaster(String name, int hp, int maxHp, int attack, int defense,
                         int movement, int x, int y, Weapon weapon, List<Artifact> artifacts,
                         int mana, int maxMana, Deck deck)
    {
        super(name, hp, maxHp, attack, defense, movement, x, y, weapon, artifacts);
        this.mana = mana;
        this.maxMana = maxMana;
        this.deck = deck;
        this.hand = new Hand(5);
    }

    public void drawCards (int amount)
    {

    }

    public void spendMana (int amount)
    {

    }

    // Getter und Setter

    public Deck getDeck ()
    {
        return deck;
    }

    public void setDeck (Deck deck)
    {
        this.deck = deck;
    }

    public Hand getHand ()
    {
        return hand;
    }

    public void setHand (Hand hand)
    {
        this.hand = hand;
    }

    public int getMana ()
    {
        return mana;
    }

    public void setMana (int mana)
    {
        this.mana = mana;
    }

    public int getMaxMana ()
    {
        return maxMana;
    }

    public void setMaxMana (int maxMana)
    {
        this.maxMana = maxMana;
    }
}
