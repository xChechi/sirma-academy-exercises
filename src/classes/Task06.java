package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter words separated by spaces:");
        String input = sc.nextLine();
        String[] words = input.split(" ");

        List<String> wordList = new ArrayList<>();
        Collections.addAll(wordList, words);

        Collections.shuffle(wordList);

        for (String word : wordList) {
            System.out.println(word);
        }

        sc.close();
    }
}
