package javacode;

public class Dog extends Animal {

    public Dog(String name, int age, String color, String size) {
        super(name, age, color, size);
    }
    @Override
    public void play() {
        System.out.println(color + " собака " + name + " играет, " + size + " , " + age + " - возраст");
    }
}
