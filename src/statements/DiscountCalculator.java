package statements;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        discountCalc();
    }

    private static void discountCalc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = sc.nextInt();
        System.out.println("Do you have a membership? (yes/no)");
        String membership = sc.next();

        if (isValidated(age, membership)) {
            if (age >= 65) {
                System.out.println("30% discount");
            } else if (age >= 18) {
                if (membership.equals("yes")) {
                    System.out.println("20% discount");
                } else System.out.println("10% discount");
            } else System.out.println("10% discount");
        }
        sc.close();
    }

    private static boolean isValidated(int age, String membership) {
        return age >= 0 && age <= 100 && (membership.equals("yes") || membership.equals("no"));
    }
}
