import java.util.Scanner;

public class reminder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dividend (number to be divided): ");
        int dividend = scanner.nextInt();
        
        System.out.print("Enter the divisor (number by which to divide): ");
        int divisor = scanner.nextInt();
        int remainder = dividend % divisor;
        System.out.println("The remainder when " + dividend + " is divided by " + divisor + " is: " + remainder);
        
        scanner.close();
    }
}
