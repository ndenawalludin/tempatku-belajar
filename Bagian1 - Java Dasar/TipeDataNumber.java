public class TipeDataNumber {
    public static void main(String[] args) {
        byte iniByte = 10;
        short iniShort = 100;
        int iniInt = 1000;
        long iniLong = 10000;

        float iniFloat = 100.11f;
        double iniDouble = 100.11;

        int decimalInt = 1000000;
        int hexaDecimal = 0xFFFFF;
        int binaryDecimal = 0b101010;

        int amount = 1_000_000_000; //underscor berfungsi hanya untuk pemisah angka agar bisa di baca, dan tidak akan memengaruhi value dari variable tersebut


        //konversi tipedata
        //Widenning Casting => konversi ini akan dilakukan secara otomatis dari javanya asalkan dari tipe data terkecil ke terbesar. example :
        //short to int
        int conversiToInt = iniShort;
        //Narrowing Casting => konversi ini dilakukan secara manual ketika tipe data terbesar ke yang terkecil. example
        //float to int
        int conversiFloatToInt = (int) iniFloat;

        System.out.println("iniByte = " + iniByte );
        System.out.println("iniShort = " + iniShort);
        System.out.println("iniInt = " + iniInt);
        System.out.println("iniLong = " + iniLong);
        System.out.println();
        System.out.println("iniFloat = " + iniFloat);
        System.out.println("iniDouble = " + iniDouble);
        System.out.println();
        System.out.println("iniDecimalInt = " + decimalInt);
        System.out.println("iniHexaDecimal = " + hexaDecimal);
        System.out.println("iniBinaryDecimal = " + binaryDecimal);
        System.out.println();
        System.out.println("iniAmount = " + amount);
        System.out.println();

        System.out.println("iniConversiShorToInt = " + conversiToInt);
        System.out.println("conversiFloatToInt = " + conversiFloatToInt);


    }
}
