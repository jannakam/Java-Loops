public class WeekdaysPrinter {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int weekdaysEndIndex = 4;

        // my initial idea
        for (int i = 0; i < days.length; i++) {
            if (i <= weekdaysEndIndex) {
                System.out.println(days[i]);
            }
       }
        // Using break
        for (int j = 0; j < days.length; j++) {
            if (j > weekdaysEndIndex) {
                break;
            }
            System.out.println(days[j]);
        }
    }
}

