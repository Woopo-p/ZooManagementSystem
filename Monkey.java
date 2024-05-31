package zoo;

class Monkey extends Animal {
    // Constructor
    public Monkey(String name, int age) {
        super(name, age);
    }

    // Override makeSound method
    @Override
    public void makeSound() {
        System.out.println("Chatter");
    }

    // Override eat method
    @Override
    public void eat() {
        System.out.println("Eating bananas");
    }
}
