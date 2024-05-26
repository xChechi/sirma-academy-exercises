package arrays;

import java.util.Scanner;

public class FactorialCalc {
    public static void main(String[] args) {
        factorialCalc();
    }

    private static void factorialCalc() {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        int sum = 1;

        for (int i = 1; i <= input; i++) {
            sum *= i;
        }

        System.out.println(sum);
    }
}
