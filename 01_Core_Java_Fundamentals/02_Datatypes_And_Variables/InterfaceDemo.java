// Define an interface
interface Animal {
    void sound();         // Method without body
    void eat();
}

// Implement the interface in a class
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog says: Woof Woof!");
    }

    public void eat() {
        System.out.println("Dog eats pedigree.");
    }
}

// Another class implementing the same interface
class Cat implements Animal {
    public void sound() {
        System.out.println("Cat says: Meow!");
    }

    public void eat() {
        System.out.println("Cat eats fish.");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        // Creating objects using interface references
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound();
        myDog.eat();

        myCat.sound();
        myCat.eat();

        /*
         🧠 Real-Life Analogy:
         An interface is like a remote control 📱 — the buttons are the methods, and each device (TV, AC, Fan) implements the response.
         Similarly, every class implements the interface differently but follows the same button layout (method structure).
        */

        // Explanation:
        // 1. We defined an interface Animal with two methods: sound() and eat().
        // 2. We implemented the interface in Dog and Cat classes with their own versions of the methods.
        // 3. In main(), we used Animal-type references to call actual class methods.
        // 4. This demonstrates polymorphism — same interface, different behavior.
    }
}
