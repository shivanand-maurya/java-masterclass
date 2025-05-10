public class StringDataTypeDemo {
    public static void main(String[] args) {
        // Suppose we're creating a profile for a user in a social media app.
        String name = "Aryan Sharma";
        String city = "Delhi";
        String bio = "Java Developer & Tech Enthusiast 💻";

        // Concatenating strings
        String fullProfile = name + " from " + city + " - " + bio;

        // Output the information
        System.out.println("User Profile:");
        System.out.println(fullProfile);

        // String methods demo
        System.out.println("Name Length: " + name.length());
        System.out.println("Bio in Uppercase: " + bio.toUpperCase());
        System.out.println("Does bio contain 'Java'? " + bio.contains("Java"));

        /*
         🧠 Real-Life Analogy:
         Think of a `String` like a diary 📓 entry — it's a written note that can hold names, addresses, messages, etc.
         Just like you can read, search, or rewrite a note, you can perform many operations on Strings in Java.
        */

        // Explanation:
        // 1. We used Strings to store user details like name, city, and bio.
        // 2. We demonstrated string concatenation using '+' operator.
        // 3. We used built-in String methods: length(), toUpperCase(), and contains().
        // 4. Strings in Java are immutable, so every change creates a new object behind the scenes.
    }
}
