package javacode;

import javacode.animals.*;

import java.util.Scanner;

public class StartAnimal {
    public void start() {
        System.out.println("\nВведите животное: (собака, кошка, корова, птица, лягушка, лошадь) --->");
        System.out.println("Для выхода напишите 'exit'");
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("\nВведите животное: ");
            String yourAnimal = in.nextLine().toLowerCase();
            if (yourAnimal.equals("exit")) {
                System.out.println("Завершено");
                break;
            }

            AnimalType type = AnimalType.convertToEnum(yourAnimal);
            processing(type);
        }
    }

     private void processing(AnimalType type) {
        if (type == null) {
            System.out.println("Попробуй снова - введи животное");
            System.out.println("Для выхода напишите 'exit'");
            return;
        }
        switch (type) {
            case DOG:
                Dog dog = new Dog("Нордик", 5, "коричневая", "большой");
                dog.describe();
                dog.play();
                break;
            case CAT:
                Cat cat = new Cat("Марфута", 9, "белая", "маленькая");
                cat.describe();
                cat.sleep();
                break;
            case COW:
                Cow cow = new Cow("Дашка", 3, "черно-белая", "большая");
                cow.describe();
                cow.eat();
                break;
            case BIRD:
                Bird bird = new Bird("Троша", 4, "зеленая", "маленький");
                bird.describe();
                bird.fly();
                break;
            case FROG:
                Frog frog = new Frog("Фрог", 2, "зеленая", "маленькая");
                frog.describe();
                frog.jump();
                break;
            case HORSE:
                Horse horse = new Horse("Земба", 7, "коричневая", "большая");
                horse.describe();
                horse.run();
                break;
        }
     }
}
