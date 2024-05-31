package zoo;

public class Lion extends Animal {
    // Constructor
    public Lion(String name, int age) {
        super(name, age);
    }

    // Override makeSound method
    @Override
    public void makeSound() {
        System.out.println("Roar");
    }

    // Override eat method
    @Override
    public void eat() {
        System.out.println("Eating meat");
    }
}
