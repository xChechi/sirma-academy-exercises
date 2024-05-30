package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        Deque<Integer> stack = new ArrayDeque<>();

        for (String str : input) {
            stack.push(Integer.parseInt(str));
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        scanner.close();
    }
}
