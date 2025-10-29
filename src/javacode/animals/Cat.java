package javacode.animals;

import javacode.interfacesMoves.Animal;
import javacode.interfacesMoves.Sleep;

public class Cat implements Animal, Sleep {
    private final String name;
    private final int age;
    private final String color;
    private final String size;

    public Cat(String name, int age, String color, String size) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.size = size;
    }

    @Override
    public void describe() {
        System.out.println(color + " кошка " + name + ", " + size + ", возраст: " + age);
    }

    @Override
    public void sleep() {
        System.out.println(color + " кошка " + name + " спит");
    }

}