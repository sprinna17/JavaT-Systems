package javacode;

public enum AnimalType {
    DOG("собака"),
    CAT("кошка"),
    BIRD("птица"),
    COW("корова"),
    FROG("лягушка"),
    HORSE("лошадь");

    private final String nameOfAnimal;

   AnimalType(String nameOfAnimal) {
       this.nameOfAnimal = nameOfAnimal;
   }

   public static AnimalType convertToEnum(String text) {
       if (text == null) return null;
       for(AnimalType t : values())
         if  (t.nameOfAnimal.equalsIgnoreCase(text)) {
           return t;
       }
       return null;
   }
}
