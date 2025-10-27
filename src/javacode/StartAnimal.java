package javacode;

import javacode.animals.*;

import java.util.Scanner;

public class StartAnimal {
    public void start() {
        System.out.println("\nВведите животное: (собака, кошка, корова, птица, лягушка, лошадь) --->");
        System.out.println("Для выхода напишите 'exit'");
        Scanner in = new Scanner(System.in);
//        Animal animal;
//        do {
//            animal = processing();
//        } while (animal == null);
//    }

        while (true) {
            System.out.println("\nВведите животное: ");
            String yourAnimal = in.nextLine().toLowerCase();
            if (yourAnimal.equals("exit")) {
                System.out.println("Завершено");
                break;
            }

            Animal animal = processing(yourAnimal);
        }
    }

     public Animal processing(String type) {


        switch (type) {
            case "собака":
                Dog dog = new Dog("Нордик", 5, "коричневая", "большой");
                dog.describe();
                dog.move();
                break;
            case "кошка":
                Cat cat = new Cat("Марфута", 9, "белая", "маленькая");
                cat.describe();
                cat.move();
                break;
            case "корова":
                Cow cow = new Cow("Дашка", 3, "черно-белая", "большая");
                cow.describe();
                cow.move();
                break;
            case "птица":
                Bird bird = new Bird("Троша", 4, "зеленая", "маленький");
                bird.describe();
                bird.move();
                break;
            case "лягушка":
                Frog frog = new Frog("Фрог", 2, "зеленая", "маленькая");
                frog.describe();
                frog.move();
                break;
            case "лошадь":
                Horse horse = new Horse("Земба", 7, "коричневая", "большая");
                horse.describe();
                horse.move();
                break;
            default:
                System.out.println("Попробуй снова - введи животное");
                System.out.println("Для выхода напишите 'exit'");
        }

         return null;
     }
}
