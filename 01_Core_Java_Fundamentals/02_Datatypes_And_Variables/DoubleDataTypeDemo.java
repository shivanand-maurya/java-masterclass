public class DoubleDataTypeDemo {
    public static void main(String[] args) {
        // Let's calculate the gravitational force between two objects using Newton's law of universal gravitation:
        // F = G * (m1 * m2) / (r * r)
        // where:
        // G = 6.67430 × 10^-11 (gravitational constant)
        // m1 = 5.972 × 10^24 (mass of Earth in kg)
        // m2 = 7.348 × 10^22 (mass of Moon in kg)
        // r = 384400000 (distance between Earth and Moon in meters)

        double G = 6.67430e-11;
        double m1 = 5.972e24;
        double m2 = 7.348e22;
        double r = 384400000;

        // Calculating gravitational force
        double force = G * (m1 * m2) / (r * r);

        // Output the result
        System.out.println("Gravitational Force between Earth and Moon: " + force + " N");

        // Double boundaries (approximate)
        double minValue = -1.7976931348623157E+308;
        double maxValue = 1.7976931348623157E+308;

        System.out.println("Minimum Value of double: " + minValue);
        System.out.println("Maximum Value of double: " + maxValue);

        /*
         🧠 Real-Life Analogy:
         Double is like a super-precise scientific calculator 🧮.
         When you're calculating forces between planets or tracking stock market trends to multiple decimal places, double gives you that depth of precision.
        */

        // Explanation:
        // 1. We used Newton's formula to calculate the gravitational force between Earth and Moon using scientific constants.
        // 2. All the values are declared as double since they require high precision and range.
        // 3. We also showed the approximate minimum and maximum values a double can store.
        // 4. This example proves why double is the default for floating-point operations — it offers both range and accuracy.
    }
}
