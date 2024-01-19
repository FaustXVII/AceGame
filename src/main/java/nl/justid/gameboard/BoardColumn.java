package nl.justid.gameboard;

import nl.justid.gameboard.exceptions.IllegalPlayerMoveException;
import nl.justid.player.Player;
import nl.justid.utils.Strings;

import java.util.Objects;

public class BoardColumn {
    private String gameSquare = Strings.WHITE_SPACE;

    public String getGameSquare() {
        return gameSquare;
    }

    public void setGameSquare(Player gameSquare) throws IllegalPlayerMoveException{
        if(touched()){
            throw new IllegalPlayerMoveException();
        }

        this.gameSquare = gameSquare.getSymbol();
    }

    private boolean touched(){
        return Strings.notWhiteSpace(this.gameSquare);
    }
}
