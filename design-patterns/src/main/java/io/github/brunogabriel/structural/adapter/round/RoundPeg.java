package io.github.brunogabriel.structural.adapter.round;

public class RoundPeg {
    private final double radius;

    public RoundPeg() {
        this.radius = 0.0;
    }

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
}