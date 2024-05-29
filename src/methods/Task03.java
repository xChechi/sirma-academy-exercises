package methods;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer number:");
        int n = Integer.parseInt(sc.nextLine());

        printTriangle(n);

        sc.close();
    }

    private static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            printLine(1, i);
        }

        for (int i = n - 1; i >= 1; i--) {
            printLine(1, i);
        }
    }

    private static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

