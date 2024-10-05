package io.github.brunogabriel.structural.adapter.square;

public record SquarePeg(double with) {
    public double getSquare() {
        return Math.pow(with, 2);
    }
}
