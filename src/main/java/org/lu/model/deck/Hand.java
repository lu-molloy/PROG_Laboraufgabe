package org.lu.model.deck;

import org.lu.model.card.Card;

import java.util.ArrayList;
import java.util.List;

public class Hand
{
    /*
    Karten, die in der Runde verfuegbar sind
     */

    private List<Card> cards;
    private int maxSize;

    public Hand (int maxSize)
    {
        this.maxSize = maxSize;
        this.cards = new ArrayList<Card>();
    }

    public boolean addCard (Card card)
    {
        if (cards.size() >= maxSize)
        {
            return false;
        }
        else{
            cards.add(card);
            return true;
        }
    }

    public void removeCard (Card card)
    {

    }

    public void clear ()
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

    public int getMaxSize ()
    {
        return maxSize;
    }

    public void setMaxSize (int maxSize)
    {
        this.maxSize = maxSize;
    }
}

