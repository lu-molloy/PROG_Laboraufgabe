package org.lu.model.deck;

import org.lu.model.card.Card;

import java.util.ArrayList;
import java.util.Collections;
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
        this.cards = new ArrayList<Card>();
    }

    public void shuffle ()
    {
        Collections.shuffle(cards);
    }

    public void addCard (Card card)
    {
        cards.add(card);
    }

    public Card drawCard ()
    {
        // gibt null, wenn leer
        if (cards.isEmpty())
        {
            return null;
        }
        return cards.remove(0);
    }

    public boolean isEmpty ()
    {
        return cards.isEmpty();
    }

    public int size ()
    {
        return cards.size();
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
