package bagian.java.collection;

import java.util.Iterator;
import java.util.List;

public class IterableAndIterartorApp {
    public static void main(String[] args) {

        /**
         * Iterable
         */
        Iterable<String> names = List.of("Nden", "Awalludin");
        for (String name : names){
            System.out.println(name);
        }

        System.out.println("==================");

        /**
         * Iterator
         */
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
