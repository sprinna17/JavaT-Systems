package javacode.animals;

import javacode.interfacesMoves.AnimalAbstract;

public class Cat extends AnimalAbstract {

    public Cat(String name, int age, String color, String size) {
      super(name, age, color, size);
    }

    @Override
    public void describe() {
        System.out.println(color + " cat " + name + ", " + size + ", age: " + age);
    }

    @Override
    public void eat() { System.out.println("She eats");  }

    @Override
    public void go() { System.out.println("She goes");  }

    @Override
    public void sleep() { System.out.println("She sleeps");  }


}