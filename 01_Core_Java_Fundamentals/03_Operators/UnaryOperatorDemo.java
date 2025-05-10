public class UnaryOperatorDemo {
    public static void main(String[] args) {
        int score = 10;

        int preIncrement = ++score;
        int preDecrement = --score;
        int postIncrement = score++;
        int postDecrement = score--;
        int negativeScore = -score;
        int positiveScore = +score;
        boolean isGameOver = false;
        boolean gameStatus = !isGameOver;

        System.out.println("Pre-increment: " + preIncrement);
        System.out.println("Pre-decrement: " + preDecrement);
        System.out.println("Post-increment: " + postIncrement);
        System.out.println("Post-decrement: " + postDecrement);
        System.out.println("Negative score: " + negativeScore);
        System.out.println("Positive score: " + positiveScore);
        System.out.println("Game running? " + gameStatus);
    }
}
