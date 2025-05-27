public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++){
            if(isPrime(i)){
                System.out.println("Prime number: " + i);
            }
        }
    }

    public static boolean isPrime(int number){
        if (number == 1 || number == 0){
            return false;
        }
        for (int i = 2; i <= number-1; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
