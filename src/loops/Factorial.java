package loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        calcFactorial();
    }

    private static void calcFactorial() {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        int sum = 1;
        for (int i = 1; i <= number; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
