package com.workintech.cylinder;

public class Cylinder extends Circle {
    private double height;


    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height<0?0:height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return super.getRadius()*getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}
