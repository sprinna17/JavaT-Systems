package javacode;

public class Cat extends Animal {

    public Cat(String name, int age, String color, String size) {
        super(name, age, color, size);
    }
    @Override
    public void sleep() {
        System.out.println(color + " кошка " + name + " спит, " + size + " , " + age + " - возраст");
    }
}
