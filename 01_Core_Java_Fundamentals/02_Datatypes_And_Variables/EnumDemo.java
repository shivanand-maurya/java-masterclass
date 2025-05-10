// Define an Enum for days of the week
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumDemo {
    public static void main(String[] args) {
        // Let's simulate a daily planner
        Day today = Day.SATURDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Back to work! 💼");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend vibes! 🎉");
                break;
            default:
                System.out.println("Keep grinding! 🚀");
        }

        // Loop through all values of the enum
        System.out.println("\nAll Days:");
        for (Day d : Day.values()) {
            System.out.println(d);
        }

        /*
         🧠 Real-Life Analogy:
         Think of an enum as a dropdown menu 📝 — it lets you choose from a fixed set of options like MONDAY to SUNDAY.
         This avoids typos and ensures only valid values are used — just like only valid menu items are clickable.
        */

        // Explanation:
        // 1. We created an enum 'Day' that lists all days of the week.
        // 2. In the main method, we used a switch statement to print messages based on the day.
        // 3. We looped over all values in the enum using values().
        // 4. Enums provide readability, safety, and are excellent for fixed constant groups.
    }
}

