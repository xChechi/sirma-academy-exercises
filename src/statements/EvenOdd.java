package statements;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        evenOdd();
    }

    private static void evenOdd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a number");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("even");
        } else System.out.println("odd");

        sc.close();
    }
}
