package generic.application;

/**
 * Membatasi data yang ingin kita gunakan (Bounded Type Parameter)
 *
 * yang diartikan type data yang bisa digunakan adalah type yang sudah kita deklarasikan atau type data turunannya
 */

public class ConstraintApp {

    public static void main(String[] args) {
        NumberData<Integer> numberData = new NumberData<>(1101);
        System.out.println(numberData.getData());

        numberData.setData(1101);
        System.out.println(numberData.getData());

//        NumberData<String> numberData1 = new NumberData<String>("Nden"); ini akan error karena bukan turunannya
    }


    public static class NumberData<T extends Number> {
    
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;

            //keuntungan dari bounded type, kita bisa mengakses method dari class parent atau turunannya
            this.data.doubleValue();
        }
    }
}