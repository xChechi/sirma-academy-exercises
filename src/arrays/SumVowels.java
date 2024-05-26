package arrays;

import java.util.Scanner;

public class SumVowels {
    public static void main(String[] args) {
        sumVowels();
    }

    private static void sumVowels() {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int sum = 0;

        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
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
    }
}
