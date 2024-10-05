package io.github.brunogabriel.structural.adapter.round;

public record RoundHole(double radius) {
    public boolean fit(RoundPeg peg) {
        return radius >= peg.getRadius();
    }
}