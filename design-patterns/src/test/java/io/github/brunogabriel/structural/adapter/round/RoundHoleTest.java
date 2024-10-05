package io.github.brunogabriel.structural.adapter.round;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RoundHoleTest {
    @Test
    public void shouldFitWhenRoundHoleRadiusIsLargerOrEqualsThenPegRadius() {
        RoundHole hole = new RoundHole(5.0);
        RoundPeg peg = new RoundPeg(5.0);
        RoundPeg smallPeg = new RoundPeg(4.99);
        RoundPeg largePeg = new RoundPeg(5.01);
        assertTrue(hole.fit(peg));
        assertTrue(hole.fit(smallPeg));
        assertFalse(hole.fit(largePeg));
    }
}