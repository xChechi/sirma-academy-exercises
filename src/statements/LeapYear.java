package statements;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        foundLeapYear();
    }

    private static void foundLeapYear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What year do you want to check?");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 400 == 0 ) {
            System.out.println("It's a leap year!");
        } else System.out.println("It's not a leap year!");
    }
}
