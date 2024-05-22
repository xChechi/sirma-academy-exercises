package loops;

import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {
        textToLetters();
    }

    private static void textToLetters() {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        for (int i = 0; i <= text.length() - 1; i++) {
            System.out.println(text.charAt(i));
        }
    }
}
