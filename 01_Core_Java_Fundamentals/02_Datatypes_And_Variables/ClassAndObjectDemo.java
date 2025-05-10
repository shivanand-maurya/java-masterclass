// Define a class: Car
class Car {
    // Properties (Fields)
    String brand;
    String model;
    int year;

    // Method (Behavior)
    void displayDetails() {
        System.out.println("Car: " + brand + " " + model + " (" + year + ")");
    }
}

public class ClassAndObjectDemo {
    public static void main(String[] args) {
        // Creating an object of Car class
        Car myCar = new Car();

        // Assigning values to the object's fields
        myCar.brand = "Toyota";
        myCar.model = "Fortuner";
        myCar.year = 2022;

        // Calling the method
        myCar.displayDetails();

        // Creating another object
        Car friendCar = new Car();
        friendCar.brand = "Hyundai";
        friendCar.model = "Creta";
        friendCar.year = 2023;

        friendCar.displayDetails();

        /*
         🧠 Real-Life Analogy:
         A class is like a car design document 📄 — it defines what a car should have (brand, model, year).
         An object is the actual car 🚗 made using that design — with specific brand, model, and year values.
        */

        // Explanation:
        // 1. We defined a class named 'Car' with fields and a method.
        // 2. We created objects 'myCar' and 'friendCar' using the Car class.
        // 3. We assigned values to each object's fields and called the method.
        // 4. This shows how Java uses classes to define structure and objects to create real entities.
    }
}
