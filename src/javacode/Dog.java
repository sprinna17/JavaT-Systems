package javacode;

public class Dog implements Animal, Movements {
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

    @Override public void sleep() {}
    @Override public void eat() {}
    @Override public void jump() {}
    @Override public void fly() {}
    @Override public void go() {}
    @Override public void run() {}
}
