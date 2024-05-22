package statements;

import java.util.Scanner;

public class PotionBrewing {
    public static void main(String[] args) {
        potionBrewing();
    }

    private static void potionBrewing() {
        Scanner sc = new Scanner(System.in);
        System.out.println("First ingredient?");
        String first = sc.next();
        System.out.println("Second ingredient?");
        String second = sc.next();

        if (first.equals("herbs")) {
            if (second.equals("water")) {
                System.out.println("Health potion");
            } else if (second.equals("oil")) {
                System.out.println("Stealth potion");
            } else System.out.println("Stamina potion");
        } else if (first.equals("berries")) {
            if (second.equals("sugar")) {
                System.out.println("Speed potion");
            } else System.out.println("Energy potion");
        } else System.out.println("No potion");

        sc.close();
    }
}
