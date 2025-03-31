package ro.ulbs.paradigme.lab3.util;

public class PasswordMaker {

    public static final int MAGIC_NUMBER = 7;
    private final String magicString;
    private final String name;
    private final StringRandomizer randomizer;

    private static final PasswordMaker instance;

    private static int accessCounter = 0;

    static {
        try {
            instance = new PasswordMaker("Mircea");
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    /**
     * Private constructor that initializes a PasswordMaker with a person's name
     * Made private to prevent direct instantiation
     * 
     * @param name The name used for password generation
     */
    private PasswordMaker(String name) {
        this.name = name;
        this.randomizer = new StringRandomizer();
        this.magicString = randomizer.generateRandomString(25);
    }

    /**
     * Static method to get the singleton instance
     * 
     * @return The singleton instance of PasswordMaker
     */
    public static PasswordMaker getInstance() {
        accessCounter++;
        return instance;
    }

    /**
     * Get the number of times getInstance() has been called
     * 
     * @return The access count
     */
    public static int getAccessCount() {
        return accessCounter;
    }

    /**
     * Generates a password based on the provided name
     * 
     * @return The generated password
     */
    public String getPassword() {
        String part1 = randomizer.generateRandomString(MAGIC_NUMBER);
        String part2 = randomizer.getRandomCharactersFrom(magicString, 10);
        String part3 = String.valueOf(name.length());
        String part4 = String.valueOf(randomizer.generateRandomInt(0, 50));
        return part1 + part2 + part3 + part4;
    }

    public String getMagicString() {
        return magicString;
    }
}