package nl.justid.rules;

import nl.justid.player.Player;

public enum Status {
    CONTINUE(null),
    WINNER(null),
    DRAW(null);

    private Player player;

    Status(final Player player){
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
