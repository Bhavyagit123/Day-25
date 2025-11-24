package com.codegnan.oop;

public class Cube extends Shape {
	    double side;

	    Cube(double side) {
	        this.side = side;
	    }

	    @Override
	    void calculateVolume() {
	        double volume = side * side * side;
	        System.out.printf("Volume of Cube: %.2f\n", volume);
	    }
	}



