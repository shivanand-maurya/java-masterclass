public class SumThreeAndFive {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++){
            if(isDivisibleByThreeAndFive(i)){
                sum += i;
                System.out.println(i + " is divisble by 3 and 5 ");
                count++;
            }
            if (count>=5){
                break;
            }
        }

        System.out.println("The total of the numbers is : " + sum);
    }

    public static boolean isDivisibleByThreeAndFive(int number){
        if (number % 3 == 0 && number % 5 == 0){
            return true;
        }
        return false;
    }
}
