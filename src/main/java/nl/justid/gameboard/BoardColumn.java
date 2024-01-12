package nl.justid.gameboard;

import nl.justid.player.Player;

public class BoardColumn {
    private String player = " ";

    public String getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player.getSymbol();
    }
}
