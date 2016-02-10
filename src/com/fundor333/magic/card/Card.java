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

package com.fundor333.magic.card;

import com.fundor333.magic.exception.DestroyCard;

import java.io.Serializable;

public abstract class Card implements Serializable {
    private String name;

    public Card(String n) {
        this.name = n;
    }

    public void destroy() throws DestroyCard {
        throw new DestroyCard(this);
    }

    public String getName() {
        return this.name;
    }

    public abstract void effect();
}
