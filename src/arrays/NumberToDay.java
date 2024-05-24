package arrays;


import java.util.Scanner;

public class NumberToDay {
    public static void main(String[] args) {
        numberConvertDay();
    }

    private static void numberConvertDay() {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        String[] weekdays = {"invalid day", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (input > 0 && input <= 7) {
            System.out.println(weekdays[input]);
        } else System.out.println(weekdays[0]);

        sc.close();
    }
}
