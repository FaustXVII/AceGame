package nl.justid.gameboard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameBoardTest {

    @Test
    public void whenSet_thenContains(){
        // Given
        GameBoard gameBoard = new GameBoard();

        // When
        gameBoard
                .getRow('a')
                .getColumn(1)
                .setPlayer("x");

        // Then
        final String result = gameBoard
                .getRow('a')
                .getColumn(1)
                .getPlayer();

        assertEquals("x", result);
    }

}