package arrays;

import java.sql.Array;

public class Clock {
    public static void main(String[] args) {
        clockByArray();
    }

    private static void clockByArray() {
        String[] times = new String[24 * 60];
        int index = 0;

        for (int hour = 0; hour < 24; hour++) {
            for (int min = 0; min < 60; min++) {
                String time = String.format("%d:%d", hour, min);
                times[index++] = time;
            }
        }

        for (String time : times) {
            System.out.println(time);
        }
    }
}
