package javacode;

public class horse extends Animal {
    public horse(String name, int age, String color, String size) {
        super(name, age, color, size);
    }

    @Override
    public void run() {
        System.out.println(color + " лошадь " + name + " бежит, " + size + " , " + age + " - возраст");
    }
}
