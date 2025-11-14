package javacode.animals;

import javacode.interfacesMoves.AnimalAbstract;
import javacode.interfacesMoves.Run;

public class Horse extends AnimalAbstract implements Run {

    public Horse(String name, int age, String color, String size) {
        super(name, age, color, size);
    }

    @Override
    public void describe() {
        System.out.println(color + " horse " + name + ", " + size + ", age: " + age);
    }

    @Override
    public void eat() { System.out.println("He eats");  }

    @Override
    public void go() { System.out.println("He goes");  }

    @Override
    public void sleep() { System.out.println("He sleeps");  }

    @Override
    public void run() {
        System.out.println(color + " horse " + name + " run");
    }

}
