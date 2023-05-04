package nl.justid;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameBoardTest {

    @Test
    void get() {
        final var result = new GameBoard().get("b", 1);

        assertEquals( "", result);
    }

    @Test
    void get2() {
        final var sut = new GameBoard();
        sut.set("b", 1, "x");

        final var result = sut.get("b", 1);

        assertEquals( "x", result);
    }

    @Test
    void get3() {
        final var sut = new GameBoard();
        sut.set("a", 1, "x");

        final var result = sut.get("a", 1);

        assertEquals( "x", result);
    }

    @Test
    void get4() {
        final var sut = new GameBoard();
        sut.set("c", 3, "x");

        final var result = sut.get("c", 3);

        assertEquals( "x", result);
    }

    @Test
    void get5(){
        assertThrows(IndexOutOfBoundsException.class, ()-> new GameBoard().set("a", 0, "x"));
    }

    @Test
    void get6(){
        assertThrows(IndexOutOfBoundsException.class, ()-> new GameBoard().set("d", 1, "x"));
    }

    @Test
    void get7(){
        assertThrows(IndexOutOfBoundsException.class, ()-> new GameBoard().get("d", 1));
    }
}