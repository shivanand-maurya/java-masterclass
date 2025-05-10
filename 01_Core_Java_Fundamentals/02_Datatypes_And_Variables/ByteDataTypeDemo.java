public class ByteDataTypeDemo {
    public static void main(String[] args) {
        // In a playgroup, kids' ages range from 1 to 10 years.
        // We can use byte here because age will always be within -128 to 127 range.
        byte age = 5;

        // Example of byte boundaries
        byte minValue = -128; // Minimum value a byte can store
        byte maxValue = 127;  // Maximum value a byte can store

        // Output values
        System.out.println("Kid's Age: " + age);
        System.out.println("Minimum Value of byte: " + minValue);
        System.out.println("Maximum Value of byte: " + maxValue);

        // Demonstrating overflow
        byte overflowExample = 127;
        overflowExample++; // It wraps around to -128 due to overflow
        System.out.println("Overflowed byte value: " + overflowExample);

        /*
         🧠 Real-Life Analogy:
         Think of byte like a small basket 🧺 that can hold only a few apples (values from -128 to 127).
         If you try to add one more apple beyond the limit, it overflows and starts from the beginning again.
        */

        // Explanation:
        // 1. We declared a byte variable 'age' and assigned it a value of 5, representing the age of a kid.
        // 2. We demonstrated the byte's range by setting 'minValue' to -128 and 'maxValue' to 127.
        // 3. The program outputs the values of 'age', 'minValue', and 'maxValue' to the console.
        // 4. We showed an example of overflow by incrementing 'overflowExample' beyond the byte limit (127).
        // 5. When the byte overflows, it wraps around to the negative side, showing how byte type behaves in Java.
    }
}
