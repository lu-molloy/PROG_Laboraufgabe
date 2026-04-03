package org.lu.model.card;

import org.lu.model.entity.Entity;
import org.lu.model.game.GameState;
import org.lu.model.items.Talent;

/**
 * Erzeugt Talente.
 */
public class TalentCard extends Card
{
    private Talent talentTemplate;

    public void play (Entity caster, GameState state)
    {
        // Talent hinzufuegen
    }

    public TalentCard (String name, String description, int manaCost, Talent talentTemplate)
    {
        super(name, description, manaCost);
        this.talentTemplate = talentTemplate;
    }

    // Getter und Setter

    public Talent getTalentTemplate ()
    {
        return talentTemplate;
    }

    public void setTalentTemplate (Talent talentTemplate)
    {
        this.talentTemplate = talentTemplate;
    }
}
