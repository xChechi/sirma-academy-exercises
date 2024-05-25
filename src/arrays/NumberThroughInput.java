package arrays;

import java.util.Scanner;

public class NumberThroughInput {
    public static void main(String[] args) {
        numberThroughInput();
    }

    private static void numberThroughInput() {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        int jumpBy = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= input; i+=jumpBy) {
            System.out.println(i);
        }
    }
}
