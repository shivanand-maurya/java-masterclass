public class ShortDataTypeDemo {
    public static void main(String[] args) {
        // In a small village, the population might range from a few hundred to a few thousand.
        // For this, short is ideal as it fits the range -32,768 to 32,767.
        short population = 5000;

        // Example of short boundaries
        short minValue = -32768; // Minimum value a short can store
        short maxValue = 32767;  // Maximum value a short can store

        // Output values
        System.out.println("Village Population: " + population);
        System.out.println("Minimum Value of short: " + minValue);
        System.out.println("Maximum Value of short: " + maxValue);

        // Demonstrating overflow
        short overflowExample = 32767;
        overflowExample++; // It wraps around to -32,768 due to overflow
        System.out.println("Overflowed short value: " + overflowExample);

        /*
         🧠 Real-Life Analogy:
         Imagine short as a medium-sized bag 🎒 that can carry a few thousand small items.
         If you try to add more than the maximum capacity, it overflows and starts from the beginning again.
        */

        // Explanation:
        // 1. We declared a short variable 'population' and assigned it a value of 5000, representing a small village population.
        // 2. We demonstrated the short's range by setting 'minValue' to -32,768 and 'maxValue' to 32,767.
        // 3. The program outputs the values of 'population', 'minValue', and 'maxValue' to the console.
        // 4. We showed an example of overflow by incrementing 'overflowExample' beyond the short limit (32,767).
        // 5. When the short overflows, it wraps around to the negative side, demonstrating the overflow behavior in Java.
    }
}
