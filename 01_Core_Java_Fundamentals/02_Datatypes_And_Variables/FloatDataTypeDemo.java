public class FloatDataTypeDemo {
    public static void main(String[] args) {
        // Let's say we are tracking the average temperature of a city for weather forecasting.
        // Float is suitable here since we don’t need high-precision decimal values.
        float avgTemperature = 36.6f; // Note: 'f' suffix is mandatory for float literals

        // Example of float boundaries
        float minValue = -3.4e38f;  // Approximate minimum value a float can store
        float maxValue = 3.4e38f;   // Approximate maximum value a float can store

        // Output values
        System.out.println("Average Temperature: " + avgTemperature + " °C");
        System.out.println("Approximate Minimum Value of float: " + minValue);
        System.out.println("Approximate Maximum Value of float: " + maxValue);

        /*
         🧠 Real-Life Analogy:
         Think of float like a medium-size measuring cup 🧪 used in a kitchen.
         It can measure decimal values but isn't suitable for ultra-precise scientific experiments.
         It's a trade-off between size and precision.
        */

        // Explanation:
        // 1. We declared a float variable 'avgTemperature' to hold a city's average temperature.
        // 2. The 'f' suffix is used to tell Java it's a float and not a double.
        // 3. We demonstrated the approximate min and max values a float can store.
        // 4. This program shows that float is useful when a moderate level of decimal precision is enough.
    }
}
