package comments;

/**
 * Demonstrates use of single-line comments (//) to explain each step.
 */
public class SingleLineCommentExample {
    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = {2, 4, 6, 8, 10};

        // Initialize sum to 0
        int sum = 0;

        // Loop over each element in the array
        for (int num : numbers) {
            // Add the current number to sum
            sum += num;
        }

        // Print out the total sum of the array elements
        System.out.println("Sum of array elements: " + sum);
    }
}
