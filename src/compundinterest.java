import java.util.Scanner;

public class compoundinterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter the annual interest ratein percentage: ");
        double annualRate = scanner.nextDouble();
        double rate = annualRate / 100;
        
        System.out.print("Enter the number of times interest is compounded per year: ");
        int timesCompounded = scanner.nextInt();
        System.out.print("Enter the number of years (t): ");
        int years = scanner.nextInt();
        double amount = principal * Math.pow(1 + (rate / timesCompounded), timesCompounded * years);
        System.out.printf("The amount after %d years is: %.2f\n", years, amount);
        scanner.close();
    }
}



