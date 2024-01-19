package nl.justid.gameboard;

import nl.justid.player.Player;

public class BoardColumn {
    private String gameSquare = " ";

    public String getGameSquare() {
        return gameSquare;
    }

    public void setGameSquare(Player gameSquare) {
        // if (WhiteSpace)
        //set
        // else
        // Throw error allready filled

        this.gameSquare = gameSquare.getSymbol();
    }
}
