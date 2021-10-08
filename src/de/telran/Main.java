package de.telran;

import static java.lang.Math.PI;

public class Main {

    public static void main(String[] args) {
        System.out.println("Find Total Circle Radius : = " + circleArea(5.5));
        System.out.println("Find Total Circle Perimeter : = " + perimeterCircle(7.5));
        System.out.println("Find Total Circle Perimeters 1 : = " + perimeterCircle1(89));
        System.out.println("Find Degrees to Fahrenheit : = " + degreesInFahrenheit(35));
        System.out.println("Find Fahrenheit to Degrees : = " + fahrenheitInDegrees(95));
        System.out.println("Find Inchers to Meters : = " + inchesToMeters(55));
    }

    static double circleArea(double r) {
        return PI * (r * r);
    }

    static double perimeterCircle(double r) {
        return (2 * PI) * r;
    }

    static float perimeterCircle1(float r) {
        return (float) ((PI * 2) * r);
    }

    static double degreesInFahrenheit(double c) {
        return c * 1.8 + 32;
    }

    static double fahrenheitInDegrees(double f) {
        return (f - 32) / 1.8;
    }

    static double inchesToMeters(double x) {
        return x * 0.0254;
    }
}

