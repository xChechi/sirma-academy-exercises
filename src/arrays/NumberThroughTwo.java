package arrays;

import java.util.Scanner;

public class NumberThroughTwo {
    public static void main(String[] args) {
        numberThroughTwo();
    }

    private static void numberThroughTwo() {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= input; i+=2) {
            System.out.println(i);
        }
    }
}
