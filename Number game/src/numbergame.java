import java.util.Random;
import java.util.Scanner;

public class numbergame {
    public static void main(String[] args) {
        playNumberGuessingGame();
    }

    private static void playNumberGuessingGame() {
        Scanner scanner = new Scanner(System.in);

        boolean play = true;
        int roundsPlayed = 0;
        int totalAttempts = 0;

        while (play) {
            // Step 1: Generate a random number within the specified range
            int lowerLimit = 1;
            int upperLimit = 100;
            int targetNumber = new Random().nextInt(upperLimit - lowerLimit + 1) + lowerLimit;

            // Step 5: Limit the number of attempts
            int maxAttempts = 10;
            int attempts = 0;

            while (attempts < maxAttempts) {
                // Step 2: Prompt the user to enter their guess
                System.out.print("Guess the number between " + lowerLimit + " and " + upperLimit + ": ");
                int userGuess = scanner.nextInt();

                // Step 3: Compare the user's guess and provide feedback
                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number " + targetNumber +
                            " in " + (attempts + 1) + " attempts.");
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

                attempts++;
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " +
                        targetNumber + ".");
            }

            // Step 7: Display the user's score
            roundsPlayed++;
            System.out.println("\nScore: Rounds played: " + roundsPlayed  + "\n");

            // Ask the user if they want to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            play = playAgain.equals("yes");
        }
    }
}
