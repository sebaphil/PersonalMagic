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

public class Creature extends Card {
    private int defence;
    private int attack;

    public Creature(String name, int defence, int attack) {
        super(name);
        this.defence = defence;
        this.attack = attack;
    }

    public void battle(Creature c) {

    }

    public void getDamage(int damage) {
    }

    @Override
    public void destroy() {

    }

    @Override
    public void effect() {

    }
}
