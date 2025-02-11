public class CaesarCipher {
    private int shift;

    public CaesarCipher(int shift) {
        this.shift = shift;
    }

    // Encrypt string
    public String encrypt(String text) {
        return process(text, shift);
    }


    // Decrypt string
    public String decrypt(String text) {
        return process(text, -shift);
    }


    // Shift letters in string
    public String process(String text, int shift) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean isChar = Character.isLetter(c);
            char start;
            if (isChar) {
                if (Character.isLowerCase(c)) {
                    start = 'a';
                } else {
                    start = 'A';
                }
                // Shift letter and add to result
                c = (char) (start + (c - start + shift) % 26);
                result = result + c;
            } else {
                // If not a letter, keep it as is
                result = result + c;
            }
        }
        return result;
    }
    
}
