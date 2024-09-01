import java.util.Scanner;

public class avgofnumusingarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        double[] numbers = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }
        
        double average = sum / n;
        System.out.println("The average of the entered numbers is: " + average);
        
        scanner.close();
    }
}
