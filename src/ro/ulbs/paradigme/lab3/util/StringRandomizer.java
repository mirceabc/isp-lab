package ro.ulbs.paradigme.lab3.util;

import java.util.Random;

public class StringRandomizer {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";

    private final Random random;

    public StringRandomizer() {
        this.random = new Random();
    }

    /**
     * Generates a random string of the specified length.
     * 
     * @param length The length of the random string to generate
     * @return A random string
     */
    public String generateRandomString(int length) {
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(randomIndex));
        }

        return sb.toString();
    }

    /**
     * Extracts a specified number of random characters from a source string.
     * 
     * @param source The source string to extract characters from
     * @param count  The number of characters to extract
     * @return A string of random characters from the source
     */
    public String getRandomCharactersFrom(String source, int count) {
        if (source == null || source.isEmpty() || count <= 0) {
            return "";
        }

        StringBuilder result = new StringBuilder(count);
        for (int i = 0; i < count; i++) {
            int randomIndex = random.nextInt(source.length());
            result.append(source.charAt(randomIndex));
        }

        return result.toString();
    }

    /**
     * Generates a random integer within the specified range [min, max].
     * 
     * @param min The minimum value (inclusive)
     * @param max The maximum value (inclusive)
     * @return A random integer
     */
    public int generateRandomInt(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
}