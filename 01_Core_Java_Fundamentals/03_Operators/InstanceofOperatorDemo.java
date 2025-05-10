class Vehicle {}
class Car extends Vehicle {}
class Bike extends Vehicle {}

public class InstanceofOperatorDemo {
    public static void main(String[] args) {
        Vehicle myVehicle = new Car();

        boolean isCar = myVehicle instanceof Car;
        boolean isBike = myVehicle instanceof Bike;
        boolean isVehicle = myVehicle instanceof Vehicle;

        System.out.println("Is myVehicle a Car? " + isCar);
        System.out.println("Is myVehicle a Bike? " + isBike);
        System.out.println("Is myVehicle a Vehicle? " + isVehicle);
    }
}
