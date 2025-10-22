package javacode;

public class frog extends Animal {

    public frog(String name, int age, String color, String size) {
        super(name, age, color, size);
    }
    @Override
    public void jump() {
        System.out.println(color + " лягушка " + name + " прыгает, " + size + " , " + age + " - возраст");
    }
}

