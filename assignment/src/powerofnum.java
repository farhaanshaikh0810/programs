import java.util.Scanner;

public class powerofnum {
    public static double power(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < Math.abs(exponent); i++) {
            result *= base;
        }
        if (exponent < 0) {
            result = 1 / result;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base number
        System.out.print("Enter base number: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        int exponent = scanner.nextInt();

        // Calculate power
        double result = power(base, exponent);
        System.out.printf("%.2f raised to the power of %d is %.4f%n", base, exponent, result);
        scanner.close();
    }
}