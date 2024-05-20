package statements;

import java.util.Scanner;

public class LargerNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert first number");
        int numberOne = sc.nextInt();

        System.out.println("Insert second number");
        int numberTwo = sc.nextInt();

        if (numberOne > numberTwo) {
            System.out.println(numberOne);
        } else if (numberTwo > numberOne) {
            System.out.println(numberTwo);
        } else {
            System.out.println("They are equal");
        }

        sc.close();
    }
}
