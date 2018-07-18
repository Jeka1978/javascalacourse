package com.army.course;

/**
 * @author Evgeny Borisov
 */
public class JavaPerson {
    public String name;
    private int age;

    public JavaPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int age() { return age; }

    public void age(int newAge) {
        System.out.println("Changing age to: " + newAge);
        age = newAge;
    }
}
