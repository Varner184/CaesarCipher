import java.util.Scanner;

public class Utility {
    
    // Method to get input from user
    public static String getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        String input = scanner.nextLine();
        return input;
    }


    // Method to get shift value from user
    public static int getShift() {
        int shift;
        try {
            shift = Integer.parseInt(getInput("Enter a shift value (0-25): "));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            shift = getShift();
        }
        if (shift > 25 || shift < 0) {
            shift = getShift();
        } 
        return shift;
    }


    // Get users choice of encryption or decryption
    public static String getChoice() {
        String choice = getInput("Enter 'e' to encrypt or 'd' to decrypt: ");
        if (!choice.equals("e") && !choice.equals("d")) {
            choice = getChoice();
        }
        return choice;
    }

    // Print welcome message
    public static void printWelcome() {
        System.out.println("-------------------------");
        System.out.println("Welcome to Caesar Cipher!");
        System.out.println("-------------------------");
        System.out.println();
        System.out.println();
    }


    // Print line of dashes
    public static void printLine(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println();
    }



}
