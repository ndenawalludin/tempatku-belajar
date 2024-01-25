public class OperasiBoolean {
    public static void main(String[] args) {
        int nilaiUjian = 70;
        int nilaiAbsen = 80;

        boolean lulusUjian = nilaiUjian >= 60;
        boolean lulusAbsen = nilaiAbsen >= 70;

        System.out.println(lulusUjian && lulusAbsen);
    }
}
