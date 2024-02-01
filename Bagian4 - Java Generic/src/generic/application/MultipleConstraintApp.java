package generic.application;

import javax.xml.crypto.Data;

/**
 * MultipleConstraintApp
 */
public class MultipleConstraintApp {
    public static void main(String[] args) {
        
        // Data<Manager> managerData = new Data<>(new Manager()); ini akan error karena "Bound mismatch" yaitu class manager tidak implement CanSayHello

        Data<VicePresident> vicePresidentData = new Data<>(new VicePresident("Nden"));
    }

    public static interface CanSayHello {
        void sayHello(String name);
    }

    public static abstract class Employee {
    
        
    }

    public static class Manager extends Employee {
    
        
    }

    public static class VicePresident extends Employee implements CanSayHello{
        @Override
        public void sayHello(String name){
            System.out.println("Hello " + name);
        }
    }

    public static class Data<T extends Employee & CanSayHello> {
        private T data;     
        
        
        public Data(T data){
            this.data = data;
        }

        /**
         * @return T return the data
         */
        public T getData() {
            return data;
        }
    
        /**
         * @param data the data to set
         */
        public void setData(T data) {
            this.data = data;
        }
    }



}