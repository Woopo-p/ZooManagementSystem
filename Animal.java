package zoo;

public class Animal {
    // Fields
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to display animal details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method to simulate the sound the animal makes
    public void makeSound() {
        System.out.println("This animal makes a sound.");
    }

    // Overloaded method to simulate the sound the animal makes a specified number
    // of times
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("This animal makes a sound.");
        }
    }

    // Method to simulate the animal eating
    public void eat() {
        System.out.println("This animal is eating.");
    }

    // Overloaded method to simulate the animal eating a specified type of food
    public void eat(String foodType) {
        System.out.println("This animal is eating " + foodType + ".");
    }
}
