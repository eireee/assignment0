import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100); // Generates a random number between 0 and 99
        System.out.println("Random number: " + randomNumber);
    }