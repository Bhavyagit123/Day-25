package com.codegnan.oop;

import java.util.Scanner;

public class Cuboid extends Shape {
    double length, width, height;

    Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    void calculateVolume() {
        double volume = length * width * height;
        System.out.printf("Volume of Cuboid: %.2f\n", volume);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Base class call
        Shape s = new Shape();
        s.calculateVolume();

        // Cube input
        System.out.println("Side of the cube:");
        double side = sc.nextDouble();
        Shape cube = new Cube(side);
        cube.calculateVolume();

        // Cuboid input
        System.out.println("Length of the cuboid:");
        double length = sc.nextDouble();

        System.out.println("Width of the cuboid:");
        double width = sc.nextDouble();

        System.out.println("Height of the cuboid:");
        double height = sc.nextDouble();

        Shape cuboid = new Cuboid(length, width, height);
        cuboid.calculateVolume();
    }
}


