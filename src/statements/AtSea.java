package statements;

import java.util.Scanner;

public class AtSea {
    public static void main(String[] args) {
        accommodation();
    }

    private static void accommodation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many days?");
        int accommodationPeriod = sc.nextInt() - 1;
        System.out.println("Room type?");
        String roomType = sc.next().toLowerCase();
        System.out.println("Assessment?");
        String assessment = sc.next().toLowerCase();

        boolean isValid = accommodationPeriod >=1 && accommodationPeriod <= 365;
        double totalPrice = 0;

        switch (roomType) {
            case "single":
                totalPrice = accommodationPeriod * 25;
                break;
            case "apartment":
                totalPrice = accommodationPeriod * 50;
                if (accommodationPeriod > 14) {
                    totalPrice = totalPrice * .5;
                } else if (accommodationPeriod > 9) {
                    totalPrice = totalPrice * .65;
                } else {
                    totalPrice = totalPrice * .7;
                }
                break;
            case "presidential":
                totalPrice = accommodationPeriod * 100;
                if (accommodationPeriod > 14) {
                    totalPrice = totalPrice * .8;
                } else if (accommodationPeriod > 9) {
                    totalPrice = totalPrice * .85;
                } else {
                    totalPrice = totalPrice * .9;
                }
                break;
            default:
                isValid = false;
                System.out.println("invalid room type");
        }

        if (assessment.equals("positive")) {
            totalPrice = totalPrice * 1.25;
        } else if (assessment.equals("negative")) {
            totalPrice = totalPrice * .9;
        } else {
            isValid = false;
            System.out.println("invalid assessment");
        }

        if (isValid) {
            System.out.printf("%.2f", totalPrice);
        }
        sc.close();

    }
}
