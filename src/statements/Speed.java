package statements;

import java.util.Scanner;

public class Speed {

    public static void main(String[] args) {
        speed();
    }

    private static void speed() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your speed?");
        int speed = sc.nextInt();

        if (speed > 160) {
            System.out.println("turbo-fast");
        } else if (speed > 120) {
            System.out.println("super-fast");
        } else if (speed > 60) {
            System.out.println("fast");
        } else if (speed > 10) {
            System.out.println("average");
        } else System.out.println("slow");

        sc.close();
    }
}
