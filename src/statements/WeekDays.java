package statements;

import java.util.Scanner;

public class WeekDays {

    public static void main(String[] args) {
        numberToWeek();
    }

    private static void numberToWeek() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a number");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");
        }

        sc.close();
    }
}
