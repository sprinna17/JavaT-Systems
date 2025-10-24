package javacode;

public class Bird implements Animal, Movements {
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
    public void move() {
        fly();
    }

    @Override
    public void fly() {
        System.out.println(color + " птица " + name + " летает");
    }
    @Override public void play() {}
    @Override public void eat() {}
    @Override public void jump() {}
    @Override public void sleep() {}
    @Override public void go() {}
    @Override public void run() {}
}
