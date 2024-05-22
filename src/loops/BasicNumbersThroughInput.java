package loops;

import java.util.Scanner;

public class BasicNumbersThroughInput {
    public static void main(String[] args) {
        calcThroughInput();
    }

    private static void calcThroughInput() {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int margin = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= number; i+=margin) {
            System.out.println(i);
        }
    }
}
