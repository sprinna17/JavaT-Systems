package javacode;

public class Cow implements Animal, Movements {
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
    public void move() {
        eat();
    }

    @Override
    public void eat() {
        System.out.println(color + " корова " + name + " ест");
    }
    @Override public void play() {}
    @Override public void sleep() {}
    @Override public void jump() {}
    @Override public void fly() {}
    @Override public void go() {}
    @Override public void run() {}

}

