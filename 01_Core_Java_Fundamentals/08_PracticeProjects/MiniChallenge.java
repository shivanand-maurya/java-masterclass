public class MiniChallenge {

    public static void main(String[] args) {
        for(double rate = 7.5; rate <= 10.0; rate=rate+0.25){
            double interestRateAmount = calculateInterest(100, rate);
            System.out.println("Interest " + rate + " % amount is " + interestRateAmount);
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }
}
