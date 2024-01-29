package generic.application;

import generic.MyData;

public class ContravariantApp {
    public static void main(String[] args) {
        MyData <Object> objectMyData = new MyData<Object>("Nden");
        objectMyData.setData(1000);

        processData(objectMyData);
        System.out.println(objectMyData.getData());

    }

    /**
     * Contravariant bisa merubah data dari parentClass. hanya saja perlu berhati hati ketika ingin mengambil data dari child
     * @param myData
     */
    public static void processData(MyData<? super String> myData){
        Object value = myData.getData();
        System.out.println("process parameter " + value);

        myData.setData("Nden Awalludin");
    }
}
