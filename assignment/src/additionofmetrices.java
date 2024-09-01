import java.util.Scanner;

public class additionofmetrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows in the matrices: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns in the matrices: ");
        int columns = scanner.nextInt();
        
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] result = new int[rows][columns];
        
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("The result of matrix addition is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
