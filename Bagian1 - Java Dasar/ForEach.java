public class ForEach {
    public static void main(String[] args) {
        String[] array = {"Nden", "Awalludin", "Hitam", "Manis", "Pinter", "Hehehe"};

        for (int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println();
        //kita coba menggunakan foreach
        for(String forEach : array){
            System.out.println(forEach);
        }
    }
}
