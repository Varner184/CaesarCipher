public class Main {
    public static void main(String[] args) {

        Utility.printWelcome();
        // Get the users choice to encrypt or decrypt
        String choice = Utility.getChoice();

        // Get the shift value from the user
        int shift = Utility.getShift();

        // Create an instance of the user's password
        CaesarCipher password = new CaesarCipher(shift);

        // Output based on encryption/decryption choice
        if (choice.equals("e")) {
            String text = Utility.getInput("Enter your password or phrase to encrypt: ");
            System.out.println();
            Utility.printLine(text.length() + 16);
            System.out.println("Encrypted text: " + password.encrypt(text));
            Utility.printLine(text.length() + 16);
        } else {
            String text = Utility.getInput("Enter your password or phrase to decrypt: ");
            System.out.println();
            Utility.printLine(text.length() + 17);
            System.out.println("Decrypted text: " + password.decrypt(text));
            Utility.printLine(text.length() + 17);
        }


    }
}