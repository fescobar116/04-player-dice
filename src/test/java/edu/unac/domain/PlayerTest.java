package edu.unac.domain;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class PlayerTest {
    @Test
    void payerWins() {
        Dice dice = new Dice(6);

        Player player = new Player(4, dice);

        assertTrue(player.play());
    }
}