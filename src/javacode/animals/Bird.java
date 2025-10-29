package javacode.animals;

import javacode.interfacesMoves.Animal;
import javacode.interfacesMoves.Fly;

public class Bird implements Animal, Fly {
    private final String name;
    private final int age;
    private final String color;
    private final String size;

    public Bird(String name, int age, String color, String size) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.size = size;
    }

    @Override
    public void describe() {
        System.out.println(color + " птица " + name + ", " + size + ", возраст: " + age);
    }

    @Override
    public void fly() {
        System.out.println(color + " птица " + name + " летает");
    }
}
