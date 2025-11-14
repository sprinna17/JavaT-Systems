package javacode.animals;

import javacode.interfacesMoves.AnimalAbstract;
import javacode.interfacesMoves.Fly;

public class Bird extends AnimalAbstract implements Fly {
 public Bird(String name, int age, String color, String size) {
     super(name, age, color, size);
 }

    @Override
    public void describe() {
        System.out.println(color + " bird " + name + ", " + size + ", age: " + age);
    }

    @Override
    public void eat() { System.out.println("She eats");  }

    @Override
    public void go() { System.out.println("She goes");  }

    @Override
    public void sleep() { System.out.println("She sleeps");  }

    @Override
    public void fly() {
        System.out.println(color + " bird " + name + " flies");
    }
}
