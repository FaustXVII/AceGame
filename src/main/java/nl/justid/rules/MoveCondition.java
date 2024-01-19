package nl.justid.rules;

import nl.justid.gameboard.*;
import nl.justid.ui.PlayerChoice;

public class MoveCondition{
    private final GameBoard gameBoard;
    private static final String WHITE_SPACE = " ";

    public MoveCondition(final GameBoard gameBoard){
        this.gameBoard = gameBoard;
    }

    public boolean correctCondition(final PlayerChoice playerChoice){
        return WHITE_SPACE.equals(getValueGameSquareOf(playerChoice));
    }

    private String getValueGameSquareOf(final PlayerChoice playerChoice){
        return gameBoard
                .getRow(playerChoice.row())
                .getColumn(playerChoice.column())
                .getGameSquare();
    }
}