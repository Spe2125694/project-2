package com.csc205.project2;

public class Cone extends Shape{

    private double radius;
    private double height;

    public Cone() {
        super();
        this.radius = 0.0;
        this.height = 0.0;
    }

    public Cone(double radius, double height) {
        super();
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double surfaceArea() {
        return ((Math.PI * radius) *
                (radius + Math.sqrt((Math.pow(height, 2.0) +
                        Math.pow(radius, 2.0)))));
    }

    public double volume() {
        return (Math.PI *
                (Math.pow(radius, 2.0)) *
                (height / 3.0));
    }


    public String toString() {
        final StringBuilder sb = new StringBuilder("Cone {");
        sb.append("radius =").append(radius);
        sb.append(", height =").append(height);
        sb.append(", surface area =").append(surfaceArea());
        sb.append(", volume =").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
