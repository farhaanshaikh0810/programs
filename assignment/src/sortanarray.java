import java.util.Arrays;
import java.util.Scanner;

public class sortanarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        
        scanner.close();
    }
}
