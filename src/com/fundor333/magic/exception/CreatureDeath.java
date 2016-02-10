/*
 * Copyright (c)
 * This code was created by Fundor333. It's distributed as
 * part of the PersonalMagic.
 *
 * PersonalMagic is Open Source and distributed under the
 * GNU General Public License, version 2
 *
 * https://www.gnu.org/licenses/gpl-2.0.html
 *
 * File Updated 10/2/2016
 */

package com.fundor333.magic.exception;

import com.fundor333.magic.card.Creature;

public class CreatureDeath extends DestroyCard {
    private Creature c;

    public CreatureDeath(Creature c) {
        super(c);
        this.c = c;
    }

    public Creature getCreature() {
        return c;
    }
}
