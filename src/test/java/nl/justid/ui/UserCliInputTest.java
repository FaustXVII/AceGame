package nl.justid.ui;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserCliInputTest {

    @Test
    void askForInput() {
        final CliInput input = x -> "";

        final var result = input.askForInput("Bob");

        assertEquals("", result);
    }
}