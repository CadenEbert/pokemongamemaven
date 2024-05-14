package javafx;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PokeBallRollTest {

    @Test
    void testPokeballOpen() {
        String pokemon = PokeBallRoll.pokeballOpen();
        assertNotNull(pokemon);
        assertTrue(pokemon.length() > 0);
    }

    @Test
    void testGreatballOpen() {
        String pokemon = PokeBallRoll.greatballOpen();
        assertNotNull(pokemon);
        assertTrue(pokemon.length() > 0);
    }

    @Test
    void testUltraballOpen() {
        String pokemon = PokeBallRoll.ultraballOpen();
        assertNotNull(pokemon);
        assertTrue(pokemon.length() > 0);
    }
}