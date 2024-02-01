package generic.application;

import generic.MyData;

/**
 * WildcardApp
 */
public class WildcardApp {

    /**
     * Jika kita tidak ingin memperdulikan generic type pada objek 
     * dan ingin mengabaikan tipe data apa yang digunakan 
     * karena hanya ngeprint sebuah data (tidak melakukan perubahan data atau mengkonfersikan sebuah data)
     * wildcard bisa digunakan. berikut contohnya.
     * @param args
     */

    public static void main(String[] args) {
        print(new MyData<String>("Nden"));
        print(new MyData<Integer>(1101));
    }

    public static void print(MyData<?> myData){
        System.out.println(myData.getData());
    }
}