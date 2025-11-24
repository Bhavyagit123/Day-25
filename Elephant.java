package com.codegnan.oop;

import java.util.Scanner;

public class Elephant extends Animal {
    int lifespan;

    Elephant(int lifespan) {
        this.lifespan = lifespan;
    }

    @Override
    int getLifespan() {
        return lifespan;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lifespan = sc.nextInt();

        // Dynamic Method Dispatch
        Animal animal = new Elephant(lifespan);

        System.out.println(animal.getLifespan());
    }
}


