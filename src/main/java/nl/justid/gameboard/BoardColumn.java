package nl.justid.gameboard;

import nl.justid.events.GameBoardUpdate.GameBoardUpdateHandler;
import nl.justid.gameboard.exceptions.IllegalPlayerMoveException;
import nl.justid.player.Player;
import nl.justid.utils.Strings;

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
        GameBoardUpdateHandler.update();
    }

    private boolean touched(){
        return Strings.notWhiteSpace(this.gameSquare);
    }
}
