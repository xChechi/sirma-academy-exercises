package statements;

import java.util.Scanner;

public class MakeUpShop {
    public static void main(String[] args) {
        shopping();
    }

    private static void shopping() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Renovation costs");
        double renovationCosts = sc.nextDouble();
        System.out.println("Count of powder");
        int powder = sc.nextInt();
        System.out.println("Count of lipsticks");
        int lipstick = sc.nextInt();
        System.out.println("Count of spirals");
        int spiral = sc.nextInt();
        System.out.println("Count of shadows");
        int shadow = sc.nextInt();
        System.out.println("Count of correctors");
        int corrector = sc.nextInt();

        double totalAmount = 0;
        double rent = 0;
        double profit = 0;
        double remainingMoney = 0;
        String enoughMoney = "";
        String endPhrase = "";
        int count = powder + lipstick + spiral + shadow + corrector;
        boolean isValid = true;

        if (renovationCosts >= 1.0 && renovationCosts <= 10000.0 && powder >= 0 && powder <= 1000
                && lipstick >= 0 && lipstick <= 1000 && spiral >= 0 && spiral <= 1000 && shadow >= 0 && shadow <= 1000
                && corrector >= 0 && corrector <= 1000) {
            totalAmount = powder * 2.6 + lipstick * 3 + spiral * 4.1 + shadow * 8.2 + corrector * 2;

            if (count >= 50) {
                totalAmount = totalAmount * .75;
            }

            rent = totalAmount * .1;
            profit = totalAmount - rent;

            if (profit > renovationCosts) {
                remainingMoney = profit - renovationCosts;
                enoughMoney = "Yes!";
                endPhrase = "lv left";
            } else {
                remainingMoney = Math.abs(profit - renovationCosts);
                enoughMoney = "Not enough money!";
                endPhrase = "lv needed";
            }
        } else {
            isValid = false;
        }

        if (isValid) {
            System.out.printf("%s %.2f %s", enoughMoney, remainingMoney, endPhrase);
        } else {
            System.out.println("Input values are out of scope");
        }

        sc.close();
    }
}
