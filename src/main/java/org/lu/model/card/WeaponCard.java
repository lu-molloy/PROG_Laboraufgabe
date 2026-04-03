package org.lu.model.card;

import org.lu.model.entity.Entity;
import org.lu.model.game.GameState;
import org.lu.model.items.Weapon;

/**
 * Erzeugt Waffen.
 */
public class WeaponCard extends Card
{
    private Weapon weaponTemplate;

    public WeaponCard (String name, String description, int manaCost, Weapon weaponTemplate)
    {
        super(name, description, manaCost);
        this.weaponTemplate = weaponTemplate;
    }

    public void play (Entity caster, GameState state)
    {
        // Waffe ausruesten
    }

    // Getter und Setter

    public Weapon getWeaponTemplate ()
    {
        return weaponTemplate;
    }

    public void setWeaponTemplate (Weapon weaponTemplate)
    {
        this.weaponTemplate = weaponTemplate;
    }
}
