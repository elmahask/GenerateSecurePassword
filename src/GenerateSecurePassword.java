import java.security.SecureRandom;
import java.util.Random;

public class GenerateSecurePassword {

    private static final Random RANDOM = new SecureRandom();
    private static final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        // Define password length
        int passwordLength = 10;

        // Generate Secure Password by calling method
        String password = generatePassword(passwordLength);

        // Print out password value
        System.out.println("Secure password: " + password);
    }

    public static String generatePassword(int length) {
        StringBuilder returnValue = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }
        return new String(returnValue);
    }
}
