package loops;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        reversing();
    }

    private static void reversing() {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        /*
        // StringBuilder solution
        String original = Integer.toString(number);
        String reversedString = new StringBuilder(original).reverse().toString();
        int reversed = Integer.parseInt(reversedString);
        */
        System.out.println(reversed);

    }
}
