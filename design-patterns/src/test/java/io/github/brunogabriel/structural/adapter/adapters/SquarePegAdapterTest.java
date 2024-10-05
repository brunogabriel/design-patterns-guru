package io.github.brunogabriel.structural.adapter.adapters;

import io.github.brunogabriel.structural.adapter.round.RoundHole;
import io.github.brunogabriel.structural.adapter.square.SquarePeg;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SquarePegAdapterTest {
    @Test
    public void shouldBeCompatibleAndFitsInHole() {
        RoundHole hole = new RoundHole(5.0);
        SquarePeg squarePeg = new SquarePeg(2.0);
        SquarePeg largerSquarePeg = new SquarePeg(20.0);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largerSquarePeg);
        assertTrue(hole.fit(squarePegAdapter));
        assertFalse(hole.fit(largeSquarePegAdapter));
    }
}