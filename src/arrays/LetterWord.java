package arrays;


import java.util.Scanner;

public class LetterWord {
    public static void main(String[] args) {
        letterWord();
    }

    private static void letterWord() {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }
}
