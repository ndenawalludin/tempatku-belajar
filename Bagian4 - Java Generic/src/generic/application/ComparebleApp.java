package generic.application;

import java.util.Arrays;

import generic.Person;

/**
 * ComparebleApp
 */
public class ComparebleApp {

    public static void main(String[] args) {
        Person[] people = {
            new Person("Nden", "Kronjo"),
            new Person("Awall", "Kronjo"),
            new Person("udin", "Kronjo")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}