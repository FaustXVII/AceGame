package nl.justid.ui;

import nl.justid.player.Player;

public interface PlayerInput {
    PlayerChoice input(final Player player, final String message);
}