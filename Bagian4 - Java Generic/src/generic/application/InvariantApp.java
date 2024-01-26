package generic.application;
import generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> stringMydata = new MyData<String>("Nden");
        // doIt(stringMydata); ini akan error karena invariant
        // MyData<Object> objectMyData = stringMydata; ini akan error karena invariant

        MyData<Object> objectMyData = new MyData<Object>(1000);
        // MyData<Integer> integerMyData = objectMyData; ini akan error karena invariant
        // doItInteger(objectMyData); ini akan error karena invariant
    }

    public static void doIt (MyData<Object> objectMydata){
        /**
         * Do something
         */
    }

    public static void doItInteger(MyData<Integer> integerMydata){
        /**
         * Do something
         */
    }
}


