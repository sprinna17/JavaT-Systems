package javacode;

public class Frog implements Animal, Movements {
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
    public void move() {
        jump();
    }

    @Override
    public void jump() {
        System.out.println(color + " лягушка " + name + " прыгает");
    }
    @Override public void play() {}
    @Override public void sleep() {}
    @Override public void run() {}
    @Override public void fly() {}
    @Override public void go() {}
    @Override public void eat() {}
}

