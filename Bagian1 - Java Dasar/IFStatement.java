public class IFStatement {
    public static void main(String[] args) {
        //ifstatement adalah sebuah block yang akan di jalankan jika block tersebut terpenuhi atau bernilai true, contoh if(true){}

        String nama = "Nden";
        int nilaiUjian = 100;

        if(nilaiUjian < 60){
            System.out.println("Siswa dengan nama " + nama + " Tidak lulus ujian");
        }else if (nilaiUjian > 60 && nilaiUjian <= 100){
            System.out.println("Siswa dengan nama " + nama + " Lulus ujian");
        }else{
            System.out.println("Nilai tidak tersedia");
        }
    }
}
