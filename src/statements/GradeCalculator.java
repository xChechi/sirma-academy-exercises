package statements;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        calculation();
    }

    private static void calculation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a grade score");
        int number = sc.nextInt();

        if (number >=0 && number <= 100) {
            if (number >= 90) {
                System.out.println("A");
            } else if (number >= 80) {
                System.out.println("B");
            } else if (number >= 70) {
                System.out.println("C");
            } else if (number >= 60) {
                System.out.println("D");
            } else System.out.println("F");
        }
        sc.close();
    }
}
