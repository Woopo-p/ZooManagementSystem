package zoo;

public class Zoo {
    public static void main(String[] args) {
        // Create instances of Animal subclasses
        Animal lion = new Lion("Sean", 5);
        Animal elephant = new Elephant("Philip", 10);
        Animal monkey = new Monkey("John", 3);

        // Display details and demonstrate polymorphism with overridden methods
        System.out.println("Lion Details:");
        lion.displayDetails();
        lion.makeSound();
        lion.eat();
        System.out.println();

        System.out.println("Elephant Details:");
        elephant.displayDetails();
        elephant.makeSound();
        elephant.eat();
        System.out.println();

        System.out.println("Monkey Details:");
        monkey.displayDetails();
        monkey.makeSound();
        monkey.eat();
        System.out.println();

        // Demonstrate polymorphism with overloaded methods
        System.out.println("Lion Overloaded Methods:");
        lion.makeSound(3); // Make sound 3 times
        lion.eat("beef"); // Eating specified type of food
        System.out.println();

        System.out.println("Elephant Overloaded Methods:");
        elephant.makeSound(2); // Make sound 2 times
        elephant.eat("leaves"); // Eating specified type of food
        System.out.println();

        System.out.println("Monkey Overloaded Methods:");
        monkey.makeSound(4); // Make sound 4 times
        monkey.eat("fruits"); // Eating specified type of food
    }
}
