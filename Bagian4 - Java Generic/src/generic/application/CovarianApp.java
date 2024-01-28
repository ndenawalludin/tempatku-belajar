package generic.application;

import generic.MyData;

public class CovarianApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<String>("Nden");

        prosesData(stringMyData);

    }

    /*
     * Covariant
     *  covariant bisa mengambil data, akan tetepa covariant tidak boleh merubah data.
     */
    public static void prosesData(MyData<? extends Object> myData){
        System.out.println(myData.getData()); 

        // myData.setData("Nden"); covariant tidak bisa merubah data karena covariant read only
    }
}
