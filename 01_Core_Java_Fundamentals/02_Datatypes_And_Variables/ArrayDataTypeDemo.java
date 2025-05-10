public class ArrayDataTypeDemo {
    public static void main(String[] args) {
        // Let's say you're managing a cricket team of 5 players and want to store their scores.

        int[] playerScores = { 75, 60, 45, 90, 30 }; // Array of int

        // Display scores
        System.out.println("Player Scores:");
        for (int i = 0; i < playerScores.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + playerScores[i] + " runs");
        }

        // Find the highest score
        int max = playerScores[0];
        for (int i = 1; i < playerScores.length; i++) {
            if (playerScores[i] > max) {
                max = playerScores[i];
            }
        }
        System.out.println("Highest Score: " + max + " runs");

        /*
         🧠 Real-Life Analogy:
         Think of an array like a cricket scoreboard 📊 — a row of boxes, each storing the score of a player.
         You can go box by box, check any score, and update it. Arrays help you handle multiple values together.
        */

        // Explanation:
        // 1. We created an array of integers to store cricket scores of 5 players.
        // 2. We accessed and printed each score using a loop.
        // 3. We calculated the highest score using simple iteration logic.
        // 4. This shows how arrays store and organize multiple values efficiently.
    }
}
