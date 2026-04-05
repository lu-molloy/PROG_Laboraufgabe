package org.lu.model.entity;

import org.lu.model.deck.Deck;
import org.lu.model.deck.Hand;
import org.lu.model.items.Artifact;
import org.lu.model.items.Talent;
import org.lu.model.items.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Player extends Entity
{
    /*
    Level, Mana, Deck, Waffen, Artefakte, Talente, Gold
     */

    private int level;
    private int mana;
    private int maxMana;
    private Deck deck;
    private Hand hand;
    private List<Talent> talents;
    private int gold;

    public Player (String name, int hp, int maxHp, int attack, int defense, int movement, int x, int y, Weapon weapon, List<Artifact> artifacts, int level, int mana, int maxMana, Deck deck, int gold)
    {
        super(name, hp, maxHp, attack, defense, movement, x, y, weapon, artifacts);
        this.level = level;
        this.mana = mana;
        this.maxMana = maxMana;
        this.deck = deck;
        this.hand = new Hand(5);
        this.talents = new ArrayList<Talent>();
        this.gold = gold;
    }

    public void drawCards (int amount)
    {

    }

    public void addGold (int amount)
    {

    }

    public void spendMana (int amount)
    {

    }

    public void levelUp ()
    {

    }

    public void addTalent (Talent t)
    {

    }

    public void equipWeapon (Weapon w)
    {

    }

    public void addArtifact (Artifact a)
    {

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

    public List<Talent> getTalents ()
    {
        return talents;
    }

    public void setTalents (List<Talent> talents)
    {
        this.talents = talents;
    }

    public int getGold ()
    {
        return gold;
    }

    public void setGold (int gold)
    {
        this.gold = gold;
    }
}
