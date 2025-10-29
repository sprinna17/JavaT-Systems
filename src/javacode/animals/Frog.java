package javacode.animals;

import javacode.interfacesMoves.Animal;
import javacode.interfacesMoves.Jump;

public class Frog implements Animal, Jump {
    private final String name;
    private final int age;
    private final String color;
    private final String size;

    public Frog(String name, int age, String color, String size) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.size = size;
    }

    @Override
    public void describe() {
        System.out.println(color + " лягушка " + name + ", " + size + ", возраст: " + age);
    }

    @Override
    public void jump() {
        System.out.println(color + " лягушка " + name + " прыгает");
    }

}

