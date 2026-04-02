package org.lu.constants;

import org.lu.model.entity.Entity;
import org.lu.model.game.GameState;

/**
 * Enthaelt Skalierungsfaktoren fuer z. B.
 * Level, Monster und Belohnungen.
 */
public abstract class BalanceConstants
{
    private String name;
    private String description;
    private int manaCost;

    public abstract void play (Entity caster, GameState state);
}
