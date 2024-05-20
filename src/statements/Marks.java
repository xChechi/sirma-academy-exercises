package statements;

import java.util.Scanner;

public class Marks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();

        if (number >= 5.5) {
            System.out.println("Excellent");
        }

        sc.close();
    }
}
