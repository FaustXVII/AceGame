package nl.justid.gameboard;

import nl.justid.events.WinConditionUpdate.WinConditionEventHandler;
import nl.justid.gameboard.exceptions.IllegalPlayerMoveException;
import nl.justid.player.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameBoardTest {

    @Test
    public void whenSet_thenContains() throws IllegalPlayerMoveException {
        // Given
        GameBoard.reset();
        WinConditionEventHandler.unSubscribeAll();

        // When
        GameBoard
                .getRow('a')
                .getColumn(1)
                .setGameSquare(Player.PLAYER_1);

        // Then
        final String result = GameBoard
                .getRow('a')
                .getColumn(1)
                .getGameSquare();

        assertEquals("X", result);
    }

}