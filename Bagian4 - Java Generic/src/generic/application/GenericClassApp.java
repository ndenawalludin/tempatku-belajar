package generic.application;

import generic.MyData;
import generic.Pair;

public class GenericClassApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Nden");
        MyData<Integer> integerMyData = new MyData<>(01);

        System.out.println(stringMyData.getData());
        System.out.println(integerMyData.getData());
    }
}
