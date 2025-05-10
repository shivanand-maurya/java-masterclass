public class AssignmentOperatorDemo {
    public static void main(String[] args) {
        int balance = 1000;
        balance += 500;
        balance -= 200;
        balance *= 2;
        balance /= 4;
        balance %= 3;

        System.out.println("Final balance: " + balance);
    }
}
