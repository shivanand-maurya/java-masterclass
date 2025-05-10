public class LongDataTypeDemo {
    public static void main(String[] args) {
        // When you're dealing with large numbers like the distance between planets or file sizes in bytes,
        // long is the perfect choice due to its vast range.
        long distanceToMoon = 384400000L; // Distance from Earth to the Moon in kilometers (approximately)

        // Example of long boundaries
        long minValue = -9223372036854775808L; // Minimum value a long can store
        long maxValue = 9223372036854775807L;  // Maximum value a long can store

        // Output values
        System.out.println("Distance to the Moon: " + distanceToMoon + " km");
        System.out.println("Minimum Value of long: " + minValue);
        System.out.println("Maximum Value of long: " + maxValue);

        // Demonstrating overflow
        long overflowExample = 9223372036854775807L;
        overflowExample++; // It wraps around to -9,223,372,036,854,775,808 due to overflow
        System.out.println("Overflowed long value: " + overflowExample);

        /*
         🧠 Real-Life Analogy:
         Think of long as a massive warehouse 🏭 with an enormous capacity to hold millions of items.
         If you try to add more than the maximum number of items it can hold, it overflows and starts from the beginning again.
        */

        // Explanation:
        // 1. We declared a long variable 'distanceToMoon' and assigned it the approximate distance from Earth to the Moon.
        // 2. We demonstrated the long's range by setting 'minValue' to -9,223,372,036,854,775,808 and 'maxValue' to 9,223,372,036,854,775,807.
        // 3. The program outputs the values of 'distanceToMoon', 'minValue', and 'maxValue' to the console.
        // 4. We showed an example of overflow by incrementing 'overflowExample' beyond the long limit (9,223,372,036,854,775,807).
        // 5. When the long overflows, it wraps around to the negative side, demonstrating the overflow behavior in Java.
    }
}
