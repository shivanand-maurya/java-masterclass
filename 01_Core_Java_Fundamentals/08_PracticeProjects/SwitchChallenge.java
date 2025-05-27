public class SwitchChallenge {
    public static void main(String[] args) {
        char natoWord = 'Z';
        switch (natoWord){
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            default:
                System.out.println("Letter " + natoWord + " was not found in the switch statement...");
        }
    }
}
