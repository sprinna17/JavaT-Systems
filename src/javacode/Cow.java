package javacode;

public class Cow extends Animal {

    public Cow(String name, int age, String color, String size) {
        super(name, age, color, size);
    }
    @Override
    public void eat() {
        System.out.println(color + " корова " + name + " ест, " + size + " , " + age + " - возраст");
    }
}

