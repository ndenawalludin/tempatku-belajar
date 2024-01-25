package Interface;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Kucing();

        animal.sound();
        System.out.println(animal.score());
    }
}
