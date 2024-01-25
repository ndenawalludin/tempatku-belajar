public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer angka1 = 100;
        System.out.println(angka1);

        
        //to object 
        int primitif = 100;
        Integer object = primitif;
        System.out.println(object);

        //to primitif
        Integer object2 = 100;
        int primitif2 = object2.intValue();
        System.out.println(primitif2);

    }
}
