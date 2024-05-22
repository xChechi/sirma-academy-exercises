package loops;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        checkVowels();
    }

    private static void checkVowels() {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int sum = 0;

        for (int i = 0; i <= text.length() - 1; i++) {
            switch (text.charAt(i)) {
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
            }

        }
        System.out.println(sum);
        sc.close();
    }
}
