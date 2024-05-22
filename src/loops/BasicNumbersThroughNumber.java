package loops;

import java.util.Scanner;

public class BasicNumbersThroughNumber {
    public static void main(String[] args) {
        calcThroughNumber();
    }

    private static void calcThroughNumber() {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= number; i+=2) {
            System.out.println(i);
        }


    }
}
