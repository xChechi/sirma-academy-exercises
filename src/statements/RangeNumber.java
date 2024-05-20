package statements;

import java.util.Scanner;

public class RangeNumber {
    public static void main(String[] args) {
        checkNumber();
    }

    private static void checkNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        if (number >= -100 && number <= 100 && number != 0) {
            System.out.println("Yes");
        } else System.out.println("No");

        sc.close();
    }
}
