package nl.justid.player;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrentPlayerHolderTest {

    @Test
    void givenDefault_whenSwitchPlayer_thenReturnOtherPlayer() {
        // Given
        Player player2 = CurrentPlayerHolder.getCurrentPlayer();
        CurrentPlayerHolder.switchPlayer();
        Player player1 = CurrentPlayerHolder.getCurrentPlayer();

        // When
        CurrentPlayerHolder.switchPlayer();

        //Then
        assertEquals(player2, CurrentPlayerHolder.getCurrentPlayer());
        assertEquals(player2, CurrentPlayerHolder.getCurrentPlayer());

        // When
        CurrentPlayerHolder.switchPlayer();
        assertEquals(player1, CurrentPlayerHolder.getCurrentPlayer());
        assertEquals(player1, CurrentPlayerHolder.getCurrentPlayer());

    }
}