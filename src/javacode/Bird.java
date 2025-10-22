package javacode;

public class Bird extends Animal {
    public Bird(String name, int age, String color, String size) {
        super(name, age, color, size);
    }

    @Override
    public void fly() {
    System.out.println(color + " птица " + name + " латает, " + size + " , " + age + " - возраст");
    }
}
