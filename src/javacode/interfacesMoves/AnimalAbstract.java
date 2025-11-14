package javacode.interfacesMoves;

public abstract class AnimalAbstract {
        // para todos los animales
        protected String name;
        protected int age;
        protected String color;
        protected String size;

        // similar valor
        public static String planet = "Earth";

        public AnimalAbstract(String name, int age, String color, String size) {
            this.name = name;
            this.age = age;
            this.color = color;
            this.size = size;
        }

        public abstract void describe();
        public abstract void eat();
        public abstract void go();
        public abstract void sleep();

}
