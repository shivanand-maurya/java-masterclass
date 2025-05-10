public class BooleanDataTypeDemo {
    public static void main(String[] args) {
        // Let's say we are checking if a person is eligible to vote.
        int age = 20;
        boolean isEligibleToVote = age >= 18; // true if age is 18 or more

        // Another real-world boolean example: checking login status
        boolean isLoggedIn = false;

        // Output the results
        System.out.println("Is the person eligible to vote? " + isEligibleToVote);
        System.out.println("Is the user currently logged in? " + isLoggedIn);

        // Changing login status to true
        isLoggedIn = true;
        System.out.println("Updated login status: " + isLoggedIn);

        /*
         🧠 Real-Life Analogy:
         A boolean is like a switch 🔘 — it's either ON (true) or OFF (false).
         Just like a light switch tells you whether the light is on or off, a boolean tells your program whether a condition is met or not.
        */

        // Explanation:
        // 1. We checked if a person is eligible to vote using the age variable and stored the result in a boolean.
        // 2. We simulated a login system using a boolean flag called 'isLoggedIn'.
        // 3. We toggled the login status and printed it before and after.
        // 4. This shows how booleans are essential for making decisions and controlling flow in programs.
    }
}
