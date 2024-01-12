package nl.justid.gameboard;

import nl.justid.player.Player;
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
                .setPlayer(Player.PLAYER_1);

        // Then
        final String result = gameBoard
                .getRow('a')
                .getColumn(1)
                .getPlayer();

        assertEquals("X", result);
    }

}