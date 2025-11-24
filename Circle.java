package com.codegnan.oop;

import java.util.Scanner;

public class Circle extends Shape1 {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();

        // Dynamic Method Dispatch
        Shape1 shape = new Circle(radius);

        double area = shape.getArea();
        System.out.printf("Area of Circle: %.2f", area);
    }
}


