public class BreakAndContinue {
    public static void main(String[] args) {
        //Break
        int counter = 1;
        while(true){
            if (counter > 10){
                break;
            }
            System.out.println("Perulangan ke-" + counter);
            counter++;
        }

        System.out.println("==================================");
        
        //Continue
        int bilanganGanjil = 1;
        for(;bilanganGanjil < 100; bilanganGanjil++){
            if(bilanganGanjil %2 == 0){
                continue;
            }
            System.out.println("ini adalah bilangan ganjil = " + bilanganGanjil);
        }
    }
}
