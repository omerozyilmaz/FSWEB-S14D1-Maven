package com.workintech.cylinder;

public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius<0?0:radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}'
                ;
    }
}