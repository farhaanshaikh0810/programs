import java.util.Scanner;

public class findthegivencharisdigitcharorspecialsym {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Check if the character is a digit
        if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit.");
        }
        else if (Character.isLetter(ch)) {
            System.out.println(ch + " is a letter.");
        }
        else {
            System.out.println(ch + " is a special symbol.");
        }
        
        scanner.close();
    }
}
