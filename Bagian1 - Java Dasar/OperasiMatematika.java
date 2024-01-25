public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println();
        System.out.println();

        //Augmented Assignments
        System.out.println(a+= b);
        System.out.println("ini adalah nilai a saat ini " + a);
        System.out.println(a-= b);
        System.out.println("ini adalah nilai a saat ini " + a);
        System.out.println(a*= b);
        System.out.println("ini adalah nilai a saat ini " + a);
        System.out.println(a/= b);
        System.out.println("ini adalah nilai a saat ini " + a);
        System.out.println(a%= b);
        System.out.println();
        System.out.println();

        //Unary Assignment
        b++;
        System.out.println(b);
        b--;
        System.out.println(b);
        System.out.println(!true);
    }
}
