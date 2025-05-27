public class DayOfTheWeek {
    public static void main(String[] args) {
        int dayNumber = 5;
        printDayOfWeek(dayNumber);
        printWeekDay(dayNumber);
    }

    public static void printDayOfWeek(int dayNumber){
        switch (dayNumber){
            case  1 -> System.out.println(dayNumber + " is Monday.");
            case  2 -> System.out.println(dayNumber + " is Tuesday.");
            case  3 -> System.out.println(dayNumber + " is Wednessday.");
            case  4 -> System.out.println(dayNumber + " is Thursday.");
            case  5 -> System.out.println(dayNumber + " is Friday.");
            case  6 -> System.out.println(dayNumber + " is Satarday.");
            case  7 -> System.out.println(dayNumber + " is Sunday.");
            default -> System.out.println(dayNumber + " Invalid Day.");

        }
    }

    public static void printWeekDay(int dayNumber){
        if (dayNumber == 1)
            System.out.println("Monday");
        else if (dayNumber == 2)
            System.out.println("Tuesday");
        else if (dayNumber == 3)
            System.out.println("Wednessday");
        else if (dayNumber == 4)
            System.out.println("Thursday");
        else if (dayNumber == 5)
            System.out.println("Friday");
        else if (dayNumber == 6)
            System.out.println("Satarday");
        else if (dayNumber == 7)
            System.out.println("Sunday");
        else
            System.out.println("Invalid Day...");
    }
}
