import java.util.Scanner;

public class DQ_2 {
    public static void main(String[] args) {
        calculateMaxAndAverage();
    }

    public static void calculateMaxAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;

        while (true) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num < 0) {
                    break;
                }
                count++;
                sum += num;
                if (num > max) {
                    max = num;
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear the invalid input
            }
        }

        scanner.close();

        if (count == 0) {
            System.out.println("No non-negative integers were entered.");
        } else {
            int average = (int) sum / count;
            System.out.print(max);
            System.out.println(" " + average);
        }
    }
}
