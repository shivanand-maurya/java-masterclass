public class TernaryOperatorDemo {
    public static void main(String[] args) {
        int temperature = 15;
        String outfit = (temperature < 20) ? "Wear a jacket" : "Wear a t-shirt";

        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Decision: " + outfit);
    }
}
