package gradedassignment1;

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number X: ");
        int x = scanner.nextInt();
        System.out.print("Enter the power N: ");
        int n = scanner.nextInt();
        scanner.close();

        int result = calculatePower(x, n);
        System.out.println("X power N is: " + result);
    }

    private static int calculatePower(int x, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            int temp = calculatePower(x, n / 2);
            return temp * temp;
        } else {
            int temp = calculatePower(x, (n - 1) / 2);
            return x * temp * temp;
        }
    }
}