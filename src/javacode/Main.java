package javacode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите животное: (собака, кошка, корова, птица, лягушка, лошадь) --->");
        Scanner in = new Scanner(System.in);
        String yourAnimal = in.nextLine().toLowerCase();

        Animal animal = null;
        switch (yourAnimal) {
            case "собака":
                animal = new Dog("Нордик", 5, "коричневая", "большой");
                animal.play();
                break;
            case "кошка":
                animal = new Cat("Марфута", 9, "белая", "маленькая");
                animal.sleep();
                break;
            case "корова":
                animal = new Cow("Дашка", 3, "черно-белая", "большая");
                animal.eat();
                break;
            case "птица":
                animal = new Bird("Троша", 4, "зеленая", "маленький");
                animal.fly();
                break;
            case "лягушка":
                animal = new frog("Фрог", 2, "зеленая", "маленькая");
                animal.jump();
                break;
            case "лошадь":
                animal = new horse("Земба", 7, "коричневая", "большаялошадь");
                animal.run();
                break;
            default:
                System.out.println("Попробуй снова");
                return;
        }

        in.close();
    }
}