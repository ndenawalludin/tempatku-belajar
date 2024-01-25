public class MethodReturnValue {
    public static void main(String[] args) {
        int nilaiUjian = 70, nilaiAbsen = 80;
        System.out.println("nilai rata rata siswa berdasarkan nilai ujian dan nilai absen adalah " + total(nilaiUjian, nilaiAbsen));

    }

    static int total(int nilaiUjian, int nilaiAbsen){
        int totalNilaiUjian = (nilaiUjian + nilaiAbsen) / 2;
        return totalNilaiUjian;
    }
}
