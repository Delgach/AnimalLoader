package com.example.vladimir.animalloader;

/**
 * Created by vladimir on 20.05.17.
 */

public class Animal {
    private String name;
    private String classeless;
    private int age;

    public Animal(String name, int age, String classeless){
        this.name = name;
        this.age = age;
        this.classeless = classeless;
    }

    public String getName() {
        return name;
    }

    public String getClasseless() {
        return classeless;
    }

    public int getAge() {
        return age;
    }
}
