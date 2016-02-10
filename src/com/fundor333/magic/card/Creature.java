/*
 * Copyright (c)
 * This code was created by Fundor333. It's distributed as
 * part of the Magic.
 *
 * Magic is Open Source and distributed under the
 * GNU General Public License, version 2
 *
 * https://www.gnu.org/licenses/gpl-2.0.html
 *
 * File Updated 10/2/2016
 */

package com.fundor333.magic.card;

import com.fundor333.magic.exception.CreatureDeath;

public class Creature extends Card {
    private int defence;
    private int attack;

    public Creature(String name, int defence, int attack) {
        super(name);
        this.defence = defence;
        this.attack = attack;
    }

    public static void battle(Creature c1, Creature c2) throws CreatureDeath {
        c1.getDamage(c2.getAttack());
        c2.getDamage(c1.getAttack());
    }

    void getDamage(int damage) throws CreatureDeath {
        if (damage >= this.defence)
            this.destroy();
    }

    @Override
    public void destroy() throws CreatureDeath {
        throw new CreatureDeath(this);
    }

    @Override
    public void effect() {
    }

    public int getDefence() {
        return defence;
    }

    public int getAttack() {
        return attack;
    }
}
