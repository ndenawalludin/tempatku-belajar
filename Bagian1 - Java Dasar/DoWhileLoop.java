public class DoWhileLoop {
    public static void main(String[] args) {
        int counter = 100;
        do{
            System.out.println("Perulangan ke-" + counter);
        }while (counter <=10);

        //perulangan dowhile sama aja dengan while, perbedaannya adalah do while pengecekan kondisinya di akhir block, dalam artian akan terjadi looping 1 kali meskipun value bernilai false, sedangkan while pengecekan kondisi di awal block
    }
}
