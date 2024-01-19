package nl.justid.rules;

import nl.justid.gameboard.*;

public class MoveCondition{
    private final GameBoard gameBoard;

    public MoveCondition(final GameBoard gameBoard){
        this.gameBoard = gameBoard;
    }

    public boolean correctCondition(final char row, final int column){
        return gameBoard.getRow(row).getColumn(column).getPlayer() == " ";
    }
}