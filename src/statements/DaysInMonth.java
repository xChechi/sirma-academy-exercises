package statements;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        calculateDays();
    }

    private static void calculateDays() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter desired month (1-12)");
        int month = sc.nextInt();
        int days = 0;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;
            case 2:
                days = 28;
                break;
            case 4, 6, 9, 11:
                days = 30;
                break;
            default:
                System.out.println("Range must be between 1 and 12");
        }

        if (days != 0) {
            System.out.println(days);
        }
    }
}
