package generic.application;

import generic.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] names = {"Nden", "Awalludin", "T4MPP"};
        Integer[] numbers = {1,2,3,4,5,6,7,8,9};

        System.out.println(
                ArrayHelper.count(names)
        );

        System.out.println(
                ArrayHelper.count(numbers)
        );
    }
}
