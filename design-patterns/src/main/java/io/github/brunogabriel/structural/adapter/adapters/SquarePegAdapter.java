package io.github.brunogabriel.structural.adapter.adapters;

import io.github.brunogabriel.structural.adapter.round.RoundPeg;
import io.github.brunogabriel.structural.adapter.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private final SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return (Math.sqrt(Math.pow((peg.with() / 2), 2) * 2));
    }
}
