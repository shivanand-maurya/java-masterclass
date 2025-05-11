package comments;

/*
 * This program computes the factorial of a given non-negative integer using an iterative algorithm.
 *
 * Algorithm steps:
 * 1. Read input value n (hardcoded here for simplicity).
 * 2. Initialize result = 1.
 * 3. For each integer i from 1 to n:
 *    a. Multiply result by i.
 *    b. Continue until i == n.
 * 4. Print the final result.
 */
public class MultiLineCommentExample {
    public static void main(String[] args) {
        int n = 5;          // Number to compute factorial of
        long result = 1;    // Variable to hold factorial result

        // Iteratively compute factorial
        for (int i = 1; i <= n; i++) {
            result *= i;    // Multiply result by the loop counter
        }

        // Output the computed factorial
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
