package javacode.animals;


import javacode.interfacesMoves.AnimalAbstract;

public class Cow extends AnimalAbstract {
    public Cow(String name, int age, String color, String size) {
        super(name, age, color, size);
    }

    @Override
    public void describe() {
        System.out.println(color + " cow " + name + ", " + size + ", age: " + age);
    }

    @Override
    public void eat() { System.out.println("She eats");  }

    @Override
    public void go() { System.out.println("She goes");  }

    @Override
    public void sleep() { System.out.println("She sleeps");  }

}

