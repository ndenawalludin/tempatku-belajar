public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {80, 90, 88, 78, 76};
        String nama = "Nden Awalludin";

        //this method without Variable Argument 
        sayCongrats(nama, values);

        System.out.println("=============================================");

        //this method is Variable argument (yaitu value array bisa langsung di isi valuenya asalkan array di tempatkan paling belakang)
        sayCongratsUsingVariableArgument("Dadan", 50, 60, 60, 55, 54);
    }

    static void sayCongrats(String nama, int[] values){
        int total = 0;
        for (int value : values){
            total += value;
        }

        total = total/values.length;

        if(total > 80){
            System.out.println("Selamat " + nama + ", Anda Lulus");
        }else{
            System.out.println("Maaf " + nama + ", Anda Tidak Lulus");
        }
    }

    static void sayCongratsUsingVariableArgument(String nama, int... values){
        int total = 0;
        for (int value : values){
            total += value;
        }

        total = total/values.length;

        if(total > 80){
            System.out.println("Selamat " + nama + ", Anda Lulus");
        }else{
            System.out.println("Maaf " + nama + ", Anda Tidak Lulus");
        }
    }
}
