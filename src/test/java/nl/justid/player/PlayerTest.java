package nl.justid.player;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void givenPlayer1_whenGetName_thenPlayer1() {
        Player player = Player.PLAYER_1;

        assertEquals("Player 1", player.getName());
    }

    @Test
    void givenPlayer2_whenGetName_thenPlayer2() {
        Player player = Player.PLAYER_2;

        assertEquals("Player 2", player.getName());
    }

    @Test
    void givenPlayer1_whenGetSymbol_thenX() {
        Player player = Player.PLAYER_1;

        assertEquals("X", player.getSymbol());
    }

    @Test
    void givenPlayer2_whenGetSymbol_thenO() {
        Player player = Player.PLAYER_2;

        assertEquals("O", player.getSymbol());
    }

    @Test
    void givenPlayer1_whenGetNumber_then1() {
        Player player = Player.PLAYER_1;

        assertEquals(1, player.getNumber());
    }

    @Test
    void givenPlayer2_whenGetNumber_then2() {
        Player player = Player.PLAYER_2;

        assertEquals(2, player.getNumber());
    }
}