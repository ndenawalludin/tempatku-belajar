public class ExpressionStatementBlock {
    public static void main(String[] args) {
        //expression adalah pernyataan sebuah tipe data dan variable, contohnya
        int nilaiUjian = 100; //nilaiUjian merupakan expression dari tipe data integer yang bervalue 100

        //statement adalah kumpulan pernyataan dari sebuah expression, contohnya
        int nilaiAbsen = 100;

        System.out.println("nilai rata rata dari nilai ujian dengan nilai absen siswa adalah = " + (nilaiUjian+nilaiAbsen)/2); //sysout ini merupakan statement atau kumpulan dari expression

        //block adalah kumpulan dari statement yang di awali dengan "{" dan di akhir dengan "}"
        String namaSiswa = "Nden";
        
        siswa(namaSiswa);
       


    }
    
    //method di bawah ini merupakan block
    static String siswa (String namaSiswa){
        System.out.println("Nama siswa : " + namaSiswa);
        System.out.println("Siswa tersebut adalah siswa kami");
        return namaSiswa;
    }
}
