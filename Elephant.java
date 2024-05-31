package zoo;

public class Elephant extends Animal {
    // Constructor
    public Elephant(String name, int age) {
        super(name, age);
    }

    // Override makeSound method
    @Override
    public void makeSound() {
        System.out.println("Trumpet");
    }

    // Override eat method
    @Override
    public void eat() {
        System.out.println("Eating grass");
    }
}
