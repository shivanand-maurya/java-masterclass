public class RelationalOperatorDemo {
    public static void main(String[] args) {
        int age = 18;

        System.out.println("Is adult? " + (age >= 18));
        System.out.println("Too young? " + (age < 13));
        System.out.println("Exact 18? " + (age == 18));
        System.out.println("Not teenager? " + (age != 15));
    }
}
