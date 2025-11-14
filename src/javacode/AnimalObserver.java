package javacode;

import javacode.animals.*;
import java.util.Scanner;

public class AnimalObserver {
    public void start() {
        System.out.println("\nWrite animal: (dog, cat, cow, bird, frog, horse) --->");
        System.out.println("For exit write 'exit'");
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("\nWrite animal: ");
            String yourAnimal = in.nextLine().toLowerCase();
            if (yourAnimal == null) {
                System.out.println("Done");
                break;
            }
            if (yourAnimal.equals("exit")) {
                System.out.println("Done");
                break;
            }

            AnimalType type = AnimalType.convertToEnum(yourAnimal);
            processing(type);
        }
    }

     private void processing(AnimalType type) {
        if (type == null) {
            System.out.println("Try again - введи животное");
            System.out.println("For exit write 'exit'");
            return;
        }
        switch (type) {
            case DOG:
                Dog dog = new Dog("Nordy", 5, "braun", "big");
                dog.describe();
                dog.eat();
                dog.go();
                dog.sleep();
                dog.play();
                break;
            case CAT:
                Cat cat = new Cat("Marfuta", 9, "white", "small");
                cat.describe();
                cat.go();
                cat.eat();
                cat.sleep();
                break;
            case COW:
                Cow cow = new Cow("Dashka", 3, "black-white", "big");
                cow.describe();
                cow.eat();
                cow.go();
                cow.sleep();
                break;
            case BIRD:
                Bird bird = new Bird("Trosha", 4, "green", "small");
                bird.describe();
                bird.eat();
                bird.go();
                bird.sleep();
                bird.fly();
                break;
            case FROG:
                Frog frog = new Frog("Frog", 2, "green", "small");
                frog.describe();
                frog.eat();
                frog.go();
                frog.sleep();
                frog.jump();
                break;
            case HORSE:
                Horse horse = new Horse("Zemba", 7, "braun", "big");
                horse.describe();
                horse.eat();
                horse.go();
                horse.sleep();
                horse.run();
                break;
        }
     }
}
