package main.model.entities;

import java.lang.Math;

import main.model.enums.Color;

public class Rectangle extends Shape {
    public Double width;
    public Double height;

    public Rectangle(Color color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return 2*(height + width);
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
    }

    @Override
    public Double area() {
        return height * width;
    }
}
