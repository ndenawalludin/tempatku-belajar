public class MethodOverloading {
    public static void main(String[] args) {
        //methodOverLoading adalah sebuah method dengan nama yang sama tetapi memiliki parameter yang berbeda
        helloWorld();
        System.out.println();
        helloWorld("Budi");
        System.out.println();
        helloWorld("Budi", 30);
        
    }

    static void helloWorld(){
        System.out.println("Hello Fuckin World");
    }

    static void helloWorld(String nama){
        System.out.println("Hello fucking " + nama);
    }

    static void helloWorld(String nama, int counter){
        System.out.println("Hello fucking " + nama + " " + counter);
    }


}
