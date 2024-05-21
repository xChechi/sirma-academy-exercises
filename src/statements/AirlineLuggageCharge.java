package statements;

import java.util.Scanner;

public class AirlineLuggageCharge {
    public static void main(String[] args) {
        luggageCharge();
    }

    private static void luggageCharge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Weight of your luggage?");
        int weight = sc.nextInt();
        System.out.println("Sum of dimensions?");
        int dimension = sc.nextInt();
        int charge = 0;

        if (dimension > 158 + 50) {
            charge = 200;
        } else if (dimension > 158 + 21) {
            charge = 100;
        } else if (dimension > 158) {
            charge = 50;
        }

        if (weight > 50) {
            charge += 100;
        }

        if (weight > 50 && dimension > 158) {
            charge += 50;
        }

        System.out.println(charge);
        sc.close();

    }
}
