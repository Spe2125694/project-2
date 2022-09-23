package com.csc205.project2;

/**
 * Driver for project 2.
 *
 * Modify the driver as needed to demonstrate your classes.
 *
 */

public class Project2 {

    public static void main(String[] args) {

        /*
        The following code works with the example design given.
         */

        ThreeDimensionalShape sphere = new Sphere(2.0);
        ThreeDimensionalShape cube = new Cube(5.0);
        ThreeDimensionalShape cylinder = new Cylinder(4.0, 1.0);
        ThreeDimensionalShape cone = new Cone(5.0, 1.0);

        System.out.println(sphere);
        System.out.println(cube);
        System.out.println(cylinder);
        System.out.println(cone);

        Sphere sphere2 = new Sphere();
        sphere2.setRadius(2.0);
        System.out.println("Sphere 2 Radius = " + sphere2.getRadius());

        Cube cube2 = new Cube();
        cube2.setWidth(4.0);
        System.out.println("Cube 2 Width = " + cube2.getWidth());

        Cylinder cylinder2 = new Cylinder();
        cylinder2.setHeight(6.0);
        cylinder2.setRadius(2.0);
        System.out.println("Cylinder 2 Height = " + cylinder2.getHeight());
        System.out.println("Cylinder 2 Radius = " + cylinder2.getRadius());

        Cone cone2 = new Cone();
        cone2.setRadius(8.0);
        cone2.setHeight(10.0);
        System.out.println("Cone 2 Radius = " + cone2.getRadius());
        System.out.println("Cone 2 Height = " + cone2.getHeight());

        /*We'll cover this stuff in module 4
        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);
        shapes.forEach(System.out::println); */
    }

}

