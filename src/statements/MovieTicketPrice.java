package statements;

import java.util.Scanner;

public class MovieTicketPrice {
    public static void main(String[] args) {
        checkingPrice();
    }

    private static void checkingPrice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = sc.nextInt();

        if (age >= 20) {
            System.out.println("10");
        } else if (age >= 13) {
            System.out.println("8");
        } else if (age >= 0) {
            System.out.println("5");
        } else System.out.println("negative value is not allowed");

        sc.close();
    }
}
