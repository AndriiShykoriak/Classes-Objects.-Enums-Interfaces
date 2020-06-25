package ua.com.figure.impl;

import ua.com.figure.Figure;

public record Circle (double radius)implements Figure {
    public double getSquare() {
        return Math.PI * radius * radius;
    }
}