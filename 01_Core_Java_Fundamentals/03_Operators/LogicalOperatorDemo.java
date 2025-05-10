public class LogicalOperatorDemo {
    public static void main(String[] args) {
        boolean hasID = true;
        boolean isAdult = true;

        if (hasID && isAdult) {
            System.out.println("Allowed entry.");
        }

        boolean isMember = false;
        if (isAdult || isMember) {
            System.out.println("Discount applicable.");
        }

        boolean isOpen = false;
        if (!isOpen) {
            System.out.println("Shop is closed.");
        }
    }
}
