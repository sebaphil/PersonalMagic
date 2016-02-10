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

public class EndGame extends Exception {
    private Player loser;
    private Player winner;

    public EndGame(Player loser, Player winner) {
        this.loser = loser;
        this.winner = winner;
    }

    public Player getLoser() {
        return loser;
    }

    public Player getWinner() {
        return winner;
    }
}
