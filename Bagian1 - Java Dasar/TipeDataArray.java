public class TipeDataArray {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[2];
        arrayString[0] = "Nden";
        arrayString[1] = "Awalludin";

        for(int i = 0; i<arrayString.length; i++){
            System.out.print(arrayString[i]);
            System.out.print(" ");
        }

        System.out.println();
        int[] arrayInt = new int[]{1, 2, 3, 4, 5};

        for(int i = 0; i<arrayInt.length; i++){
            System.out.println(arrayInt[i]);
        }

        //how about array dalam array
        String[][] arrayDuaDimensi;

        arrayDuaDimensi = new String[][]{
            {"Nden", "Awalludin"},
            {"Bahrul", "Ulumudin"},
            {"Hendri", "Sihabudin"}
        };

        //Nden Ulumudin
        System.out.println(arrayDuaDimensi[0][0] + " " + arrayDuaDimensi[1][1]);

        //Hendry Awalludin
        System.out.println(arrayDuaDimensi[2][0] + " " + arrayDuaDimensi[0][1]);

    }
}
