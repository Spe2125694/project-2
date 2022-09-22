package com.csc205.project2;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

/*
     * This test is to ensure Cone.java was set up correctly.
     *   I use decimal formatting so that I don't have to worry
     *   about finding the massive decimal given because of pi.
     */

class ConeTest {

    //  Tests that surfaceArea() works properly.
    @Test
    void surfaceArea() {
        DecimalFormat dmf = new DecimalFormat("0.00");
        double r = 6.0;
        double h = 8.0;
        double expected = 301.59;
        Cone cone = new Cone(r, h);
        String actualString = dmf.format(cone.surfaceArea());
        double actual = Double.parseDouble(actualString);
        Assert.assertEquals(expected, actual);
    }

    //  Tests that volume() works properly.
    @Test
    void volume() {
        DecimalFormat dmf = new DecimalFormat("0.00");
        double r = 6.0;
        double h = 8.0;
        double expected = 301.59;
        Cone cone = new Cone(r, h);
        String actualString = dmf.format(cone.volume());
        double actual = Double.parseDouble(actualString);
        Assert.assertEquals(expected, actual);
    }
}