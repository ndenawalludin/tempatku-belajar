public class PolymorphismVSInheritence {
    public static void main(String[] args) {
        Employee employee = new Employee("Nden");
        Employee manager = new Manager("Nden");
        Employee vicePresident = new VicePresident("Nden");

        employee.sayHallo("Budi");
        manager.sayHallo("Joko");
        vicePresident.sayHallo("Arham");

        sayHallo(employee.name);
        sayHallo(manager.name);
        sayHallo(vicePresident.name);

        
    }

    static void sayHallo(String name){
        System.out.println("Hallloooo " + name);
    }
}
