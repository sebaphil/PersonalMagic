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

import com.fundor333.magic.player.Player;

public class EndDeck extends Exception {
    private Player p;

    public EndDeck(Player player) {
        this.p = player;
    }

    public Player getPlayer() {
        return p;
    }
}
