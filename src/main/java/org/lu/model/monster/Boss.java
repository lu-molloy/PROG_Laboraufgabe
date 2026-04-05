package org.lu.model.monster;

import org.lu.model.entity.Player;
import org.lu.model.items.Artifact;
import org.lu.model.items.Weapon;

import java.util.List;

public class Boss extends Monster
{
    /*
    Spezialfaehigkeiten
     */

    private String specialAbilityName;
    private String specialAbilityDescription;
    private int specialAbilityPower;
    private int phase;
    private boolean enraged; // z. B. wenn HP < 30%

    public Boss(String name, int hp, int maxHp, int attack, int defense,
                int movement, int x, int y, Weapon weapon, List<Artifact> artifacts,
                int level, String specialAbilityName,
                String specialAbilityDescription, int specialAbilityPower)
    {
        super(name, hp, maxHp, attack, defense, movement, x, y,
                weapon, artifacts, level, true);

        this.specialAbilityName = specialAbilityName;
        this.specialAbilityDescription = specialAbilityDescription;
        this.specialAbilityPower = specialAbilityPower;
        this.phase = 1;
        this.enraged = false;
    }

    public void activateSpecialAbility (Player player)
    {
        // z. B.: Boss fuegt extra Schaden zu
        player.takeDamage(specialAbilityPower);
    }

    public void enterNextPhase ()
    {

    }

    public boolean isEnraged ()
    {
        return enraged;
    }

    public void checkEnrage ()
    {
        if (!enraged && super.getHp() < (super.getMaxHp() / 2))
        {
            enraged = true;
            super.setAttack(super.getAttackValue() + 1);
            super.setDefense(super.getDefenseValue() + 1);
        }
    }
}
