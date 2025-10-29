package javacode.animals;

import javacode.interfacesMoves.Animal;
import javacode.interfacesMoves.Eat;

public class Cow implements Animal, Eat {
    private final String name;
    private final int age;
    private final String color;
    private final String size;

    public Cow(String name, int age, String color, String size) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.size = size;
    }

    @Override
    public void describe() {
        System.out.println(color + " корова " + name + ", " + size + ", возраст: " + age);
    }

    @Override
    public void eat() {
        System.out.println(color + " корова " + name + " ест");
    }

}

