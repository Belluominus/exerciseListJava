package main.model.entities;

import main.model.enums.Color;

public class Circle extends Shape {
    private static Double pi = 3.14159;
    private Double radius;

    public Circle() {
    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area() {
        return pi * (Math.pow(radius, 2));
    }
}
