package javacode;

import javacode.interfacesMoves.AnimalAbstract;
import java.util.Map;

public class AnimalRepository {
    private final Map<String, AnimalAbstract> animals;
    private int idCounter = 1;

    public AnimalRepository() {
        this.animals = new HashMap<>();
    }

}
