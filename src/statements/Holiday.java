package statements;

import java.util.Scanner;

public class Holiday {
    public static void main(String[] args) {
        onHoliday();
    }

    private static void onHoliday() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your budget");
        double budget = sc.nextDouble();
        System.out.println("Enter the season");
        String season = sc.next();

        double price = 0;

        if (budget > 1000) {
            System.out.println("Somewhere is Asia");
            if (season.equals("summer") || season.equals("winter")) {
                price = budget * .9;
                System.out.printf("Hotel - %.2f", price);
            }
        } else if (budget > 100) {
            System.out.println("Somewhere is Europe");
            if (season.equals("summer")) {
                price = budget * .4;
                System.out.printf("Camp - %.2f", price);
            } else {
                price = budget * .8;
                System.out.printf("Hotel - %.2f", price);
            }
        } else  {
            System.out.println("Somewhere is Bulgaria");
            if (season.equals("summer")) {
                price = budget * .3;
                System.out.printf("Camp - %.2f", price);
            } else {
                price = budget * .7;
                System.out.printf("Hotel - %.2f", price);
            }
        }
        sc.close();
    }
}
