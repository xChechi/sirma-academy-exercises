package arrays;

public class MultiTable {
    public static void main(String[] args) {
        multiplicationTable();
    }

    private static void multiplicationTable() {
        String[] table = new String[100];
        int index = 0;
        int sum;

        for (int first = 1; first <= 10; first++) {
            for (int second = 1; second <= 10; second++) {
                sum = first * second;
                String time = String.format("%d * %d = %d", first, second, sum);
                table[index++] = time;
            }
        }

        for (String number : table) {
            System.out.println(number);
        }
    }
}
