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
