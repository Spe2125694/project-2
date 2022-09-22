package com.csc205.project2;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

    /*
     * This test is to ensure Cube.java was set up correctly.
     */

class CubeTest {

    //  Tests that surfaceArea() works properly.
    @Test
    void surfaceArea() {
        double w = 5.0;
        double expected = 150.0;
        Cube cube = new Cube(w);
        double actual = cube.surfaceArea();
        Assert.assertEquals(expected, actual);
    }

    //  Tests that volume() works properly.
    @Test
    void volume() {
        double w = 3.0;
        double expected = 27.0;
        Cube cube = new Cube(w);
        double actual = cube.volume();
        Assert.assertEquals(expected, actual);

    }
}