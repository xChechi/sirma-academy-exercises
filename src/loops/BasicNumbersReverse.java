package loops;

import java.util.Scanner;

public class BasicNumbersReverse {
    public static void main(String[] args) {
        calcReverse();
    }

    private static void calcReverse() {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        if (number > 1) {
            for (int i = number; i >= 1; i--) {
                System.out.println(i);
            }

        } else System.out.println("number is not positive");
    }
}
