package nl.justid;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserInputAdapterTest {

    @Test
    void mapInput() {
       final var input =  new UserInputAdapter().mapInput("b1");

       assertEquals("b1", input);
    }

    @Test
    void mapInput2() {
        final var input =  new UserInputAdapter().mapInput("b2");

        assertEquals("b2", input);
    }

    @Test
    void mapInput3() {
        final var input =  new UserInputAdapter().mapInput("c2");

        assertEquals("c2", input);
    }

}