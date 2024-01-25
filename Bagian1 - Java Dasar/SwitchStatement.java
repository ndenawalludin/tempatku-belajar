public class SwitchStatement {
    public static void main(String[] args) {
        String nilaiUjian = "A";

        switch(nilaiUjian){
            case "A":
            System.out.println("Selamat nilai anda sempurna, dan lulus ujian");
            break;
            case "B":
            System.out.println("Selamat nilai anda baik, dan lulus ujian");
            break;
            case "C":
            System.out.println("Selamat nilai anda cukup, dan lulus ujian");
            break;
            case "D":
            System.out.println("Anda tidak lulus ujian");
            break;
            default:
            System.out.println("Nilai tidak diketahui");
        }
    }
}
