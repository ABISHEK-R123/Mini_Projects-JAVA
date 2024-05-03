import java.security.SecureRandom;

public class RandomPasswordGenerator {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+{}[]|\\:;<>,.?/";
    private static final SecureRandom random = new SecureRandom();

    public static void main(String[] args) {
        int length = 12; // Change the length of the password as needed
        String password = generatePassword(length);
        System.out.println("Random Password: " + password);
    }

    public static String generatePassword(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(randomIndex));
        }
        return sb.toString();
    }
}