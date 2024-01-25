public class RecursiveMethod {
    public static void main(String[] args) {
        int value = 5;
        factorialLoop(value);
        System.out.println();
        System.out.println("Faktorial " + value + " adalah = " + recursiveMethod(value));
    }

    static void factorialLoop(int value){
        int result = 1;
        for (int i = 1; i <= value; i++){
            result *= i;
        }

        System.out.println("Faktorial " + value + " adalah = " + result);
    }

    static int recursiveMethod(int value){
        if (value == 1){
            return 1;
        }else{
            return value *recursiveMethod(value -1);
        }
    }
}
