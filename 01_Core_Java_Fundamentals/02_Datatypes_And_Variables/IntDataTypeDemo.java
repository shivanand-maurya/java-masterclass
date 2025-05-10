public class IntDataTypeDemo {
    public static void main(String[] args) {
        // Let's consider the population of a city, which can go into millions.
        // For this, we use int because it can handle values well beyond the limits of byte and short.
        int population = 15000000; // Population of a city

        // Example of int boundaries
        int minValue = -2147483648; // Minimum value an int can store
        int maxValue = 2147483647;  // Maximum value an int can store

        // Output values
        System.out.println("City Population: " + population);
        System.out.println("Minimum Value of int: " + minValue);
        System.out.println("Maximum Value of int: " + maxValue);

        // Demonstrating overflow
        int overflowExample = 2147483647;
        overflowExample++; // It wraps around to -2,147,483,648 due to overflow
        System.out.println("Overflowed int value: " + overflowExample);

        /*
         🧠 Real-Life Analogy:
         Think of int as a large container 🏢 that can hold a massive number of items (values).
         If you try to add more than its capacity, it overflows and starts from the beginning again.
        */

        // Explanation:
        // 1. We declared an int variable 'population' and assigned it a value of 15,000,000, representing the population of a city.
        // 2. We demonstrated the int's range by setting 'minValue' to -2,147,483,648 and 'maxValue' to 2,147,483,647.
        // 3. The program outputs the values of 'population', 'minValue', and 'maxValue' to the console.
        // 4. We showed an example of overflow by incrementing 'overflowExample' beyond the int limit (2,147,483,647).
        // 5. When the int overflows, it wraps around to the negative side, demonstrating the overflow behavior in Java.
    }
}
