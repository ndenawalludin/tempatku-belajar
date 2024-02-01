package generic.application;

import generic.MyData;

/**
 * TypeErasureApp
 */
public class TypeErasureApp {

    public static void main(String[] args) {
        //type erasure adalah menghilangkan generic type nya.
        MyData myData = new MyData<>("Nden"); 

        //ini akan bahaya karena kita melakukan konfersi tidak ada error bahkan saat dicompile
        MyData<Integer> integerMydata = myData;
        Integer integer = integerMydata.getData();

        //maka dari itu harus berhati hati ketika ingin menggunakan type erasure

    }
}