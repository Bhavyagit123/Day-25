package com.codegnan.oop;

import java.util.Scanner;

public class MotorCycle extends Vehicle1 {
    double speed;

    MotorCycle(double speed) {
        this.speed = speed;
    }

    @Override
    double getSpeed() {
        return speed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double speed = sc.nextDouble();

        // Dynamic Method Dispatch
        Vehicle1 v = new MotorCycle(speed);

        System.out.println(v.getSpeed());
    }
}



