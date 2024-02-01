package generic.application;

import java.util.Arrays;
import java.util.Comparator;

import generic.Person;

/**
 * ComparatorApp
 */
public class ComparatorApp {

    /*
     * Comparator ini digunakan jika class tidak bisa di edit dan tidak implement comparable
     */

     public static void main(String[] args) {
        
        Person[] people = {
            new Person("Nden", "Kronjo"),
            new Person("Awall", "Kronjo"),
            new Person("udin", "Kronjo")
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2){
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(people, comparator);

        System.out.println(Arrays.toString(people));
     }
}