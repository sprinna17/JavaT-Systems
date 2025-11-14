package javacode;

public enum AnimalType {
    DOG("dog"),
    CAT("cat"),
    BIRD("bird"),
    COW("cow"),
    FROG("frog"),
    HORSE("horse");

    private final String nameOfAnimal;

   AnimalType(String nameOfAnimal) {
       this.nameOfAnimal = nameOfAnimal;
   }

   public static AnimalType convertToEnum(String text) {
       for(AnimalType t : values())
         if  (t.nameOfAnimal.equalsIgnoreCase(text)) {
           return t;
       }
       return null;
   }
}
