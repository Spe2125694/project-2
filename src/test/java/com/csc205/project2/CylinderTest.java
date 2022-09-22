package com.csc205.project2;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;
import java.text.DecimalFormat;

    /*
     * This test is to ensure Cylinder.java was set up correctly.
     *   I use decimal formatting so that I don't have to worry
     *   about finding the massive decimal given because of pi.
     */

class CylinderTest {

    // Tests that surfaceArea() works properly.
    @Test
    void surfaceArea() {
        DecimalFormat dmf = new DecimalFormat("0.00");
        double h = 18.0;
        double r = 12.0;
        double expected = 2261.95;
        Cylinder cylinder = new Cylinder(h, r);
        String stringActual = dmf.format(cylinder.surfaceArea());
        double actual = Double.parseDouble(stringActual);
        Assert.assertEquals(expected, actual);
    }

    //  Tests that volume() works properly.
    @Test
    void volume() {
        DecimalFormat dmf = new DecimalFormat("0.0");
        double h = 10;
        double r = 5;
        double expected = 250.0;
        Cylinder cylinder = new Cylinder(h, r);
        String stringActual = dmf.format(cylinder.volume() / Math.PI);
        double actual = Double.parseDouble(stringActual);
        Assert.assertEquals(expected, actual);

    }
}