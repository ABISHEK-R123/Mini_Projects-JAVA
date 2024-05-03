import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    private static final int Minimum_Range = 1,Maximum_Range = 100, Maximum_Attemps = 10, Maximum_Rounds = 3;

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int totalScore = 0;

        System.out.println("-----------------NUMBER GUESSING GAME-----------------\nTotal Number Of Rounds : 3");
        System.out.println("Attemps in Each Round : 10\n");
        for (int i = 1; i <= Maximum_Rounds; i++) {
            int randomNumber = rand.nextInt(Maximum_Range) + Minimum_Range;
            int attempts = 0;

            System.out.printf("Round %d: Guess the randomNumber between %d and %d in %d attempts.\n", i, Minimum_Range, Maximum_Range,
                    Maximum_Attemps);
            while (attempts < Maximum_Attemps) {
                System.out.println("Enter the Number to Guess the Random number : ");
                int UserEnterdNumber = in.nextInt();
                attempts = attempts + 1;

                if (UserEnterdNumber == randomNumber) {
                    int roundscore = Maximum_Attemps - attempts;
                    totalScore = totalScore + roundscore;
                    System.out.printf("YAHOOO! Number Guessed Successfully. Attempts = %d. Round Score = %d\n\n\n",
                            attempts, roundscore);
                    break;
                }

                else if (UserEnterdNumber < randomNumber) {
                    System.out.printf("The randomNumber is greater than %d. Attempts Left = %d.\n", UserEnterdNumber,
                            Maximum_Attemps - attempts);
                }

                else if (UserEnterdNumber > randomNumber) {
                    System.out.printf("The randomNumber is less than %d. Attempts Left = %d.\n", UserEnterdNumber,
                            Maximum_Attemps - attempts);
                }

            }

            if (attempts == Maximum_Attemps) {
                System.out.printf("\nRound = %d\n", i);
                System.out.println("Attempts = 0");
                System.out.printf("The Random Number Is : %d\n\n", randomNumber);
            }
        }
        System.out.printf("Game Over. Total Score = %d\n", totalScore);
        in.close();
    }
}