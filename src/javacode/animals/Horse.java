package javacode.animals;

import javacode.Animal;
import javacode.interfacesMoves.Run;

public class Horse implements Animal, Run {
    private final String name;
    private final int age;
    private final String color;
    private final String size;

    public Horse(String name, int age, String color, String size) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.size = size;
    }

    @Override
    public void describe() {
        System.out.println(color + " лошадь " + name + ", " + size + ", возраст: " + age);
    }

    @Override
    public void move() {
        run();
    }

    @Override
    public void run() {
        System.out.println(color + " лошадь " + name + " бежит");
    }

}
