package org.lu.model.deck;

import org.lu.model.card.Card;

import java.util.List;
import java.util.Random;

public class Deck
{
    /*
    Kartenliste, Ziehen, Mischen
     */

    private List<Card> cards;
    private Random random;

    public Deck ()
    {

    }

    public void shuffle ()
    {

    }

    public void addCard (Card card)
    {

    }

    public void drawCard ()
    {
        // gibt null, wenn leer
    }

    public boolean isEmpty ()
    {

    }

    public int size ()
    {

    }

    // Getter und Setter

    public List<Card> getCards ()
    {
        return cards;
    }

    public void setCards (List<Card> cards)
    {
        this.cards = cards;
    }

    public Random getRandom ()
    {
        return random;
    }

    public void setRandom (Random random)
    {
        this.random = random;
    }
}
