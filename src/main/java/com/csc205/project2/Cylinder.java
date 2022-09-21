package com.csc205.project2;

public class Cylinder extends Shape {

    private double height;
    private double radius;

    public Cylinder() {
        super();
        this.height = 0.0;
        this.radius = 0.0;
    }

    public Cylinder(double v, double v1) {
        super();
        this.height = v;
        this.radius = v1;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double surfaceArea() {
        return ((2.0 * Math.PI * height * radius) +
                (2.0 * Math.PI * (Math.pow(radius, 2.0))));
    }

    public double volume() {
        return (Math.PI *
                Math.pow(radius, 2.0) *
                height);
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("radius = ").append(radius);
        sb.append(", height = ").append(height);
        sb.append(", surface area = ").append(surfaceArea());
        sb.append(", volume = ").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
