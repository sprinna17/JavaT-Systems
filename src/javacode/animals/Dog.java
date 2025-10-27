package javacode.animals;

import javacode.Animal;
import javacode.interfacesMoves.Play;

public class Dog implements Animal, Play {
    private final String name;
    private final int age;
    private final String color;
    private final String size;

    public Dog(String name, int age, String color, String size) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.size = size;
    }

    @Override
    public void describe() {
        System.out.println(color + " собака " + name + ", " + size + ", возраст: " + age);
    }

    @Override
    public void move() {
        play();
    }

    @Override
    public void play() {
        System.out.println(color + " собака " + name + " играет");
    }

}
