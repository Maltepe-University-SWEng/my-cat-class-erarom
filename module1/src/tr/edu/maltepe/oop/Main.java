package tr.edu.maltepe.oop;

public class Main {
    public static void main(String[] args) {
        // Create Cat objects
        Cat cat1 = new Cat("quaresma", 3);
        Cat cat2 = new Cat("mariogomez", 2);

        // Call meow method
        cat1.meow();
        cat2.meow();
    }
}

