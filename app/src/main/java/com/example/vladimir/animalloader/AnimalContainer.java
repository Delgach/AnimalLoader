package com.example.vladimir.animalloader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vladimir on 20.05.17.
 */

public class AnimalContainer {


    public static final List<Animal> getAnimalsList(){
       List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Bob", 3, "cat"));
        animals.add(new Animal("Clain", 4, "dog"));
        animals.add(new Animal("Rekt", 55, "cat"));
        animals.add(new Animal("Rob", 64, "horse"));
        animals.add(new Animal("Nell", 7, "dog"));
        animals.add(new Animal("Victor", 18, "duck"));
        animals.add(new Animal("Mauli", 9, "duck"));
        animals.add(new Animal("Vasya", 31, "duck"));
        animals.add(new Animal("Boris", 9, "horse"));
        animals.add(new Animal("Edu", 3, "cat"));

        return animals;

    }

}
