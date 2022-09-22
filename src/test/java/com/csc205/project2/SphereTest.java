package com.csc205.project2;

import org.junit.jupiter.api.Test;
import java.text.DecimalFormat;
import static org.junit.jupiter.api.Assertions.*;

    /*
    * This test is to ensure Sphere.java was set up correctly.
    *   I use decimal formatting so that I don't have to worry
    *   about finding the massive decimal given because of pi.
    */

class SphereTest {

    //  Tests that surfaceArea() works properly.
    @Test
    void surfaceArea() {
        DecimalFormat dmf = new DecimalFormat("0.00");
        double r = 4.0;
        double expected = 201.06;
        Sphere s = new Sphere(r);
        String stringActual = dmf.format(s.surfaceArea());
        double actual = Double.parseDouble(stringActual);
        assertEquals(expected, actual);
    }

    // Tests that volume() works properly.
    @Test
    void volume() {
        DecimalFormat dmf = new DecimalFormat("0.00");
        double r = 4.0;
        double expected = 268.08;
        Sphere s = new Sphere(r);
        String stringActual = dmf.format(s.volume());
        double actual = Double.parseDouble(stringActual);
        assertEquals(expected, actual);
    }
}