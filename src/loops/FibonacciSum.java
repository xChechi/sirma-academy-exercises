package loops;

import java.util.Scanner;

public class FibonacciSum {
    public static void main(String[] args) {
        fibonacciSum();
    }

    private static void fibonacciSum() {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        int sum;
        if (number == 1) {
            sum = 0;
        } else if (number == 2) {
            sum = 1;
        } else {
            int first = 0, second = 1;
            sum = first + second;
            for (int i = 3; i <= number; i++) {
                int next = first + second;
                sum += next;
                first = second;
                second = next;
            }
        }
        System.out.println(sum);
    }
}
