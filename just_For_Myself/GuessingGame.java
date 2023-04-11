package just_For_Myself;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    // First of all create necessary variables
    /*
    2. Create default methods for variables
    3. Create a method for generating random number
    4. Create a method for playing game while true;
    5. ask one more time to play or not
    6. if yes playGame else thank you
    7. Call the method
     */
        private int randomNumber;
        private int numGuesses;
        private boolean gameOver;

        public GuessingGame() {
            this.randomNumber = generateRandomNumber();
            this.numGuesses = 0;
            this.gameOver = false;
        }

        private int generateRandomNumber() {
            Random random = new Random();
            return random.nextInt(100) + 1;
        }

        public void playGame() {
            Scanner scanner = new Scanner(System.in);

            while (!gameOver) {
                System.out.print("Guess a number between 1 and 100: ");
                int guess = scanner.nextInt();
                numGuesses++;

                if (guess == randomNumber) {
                    System.out.println("Congratulations, you guessed the number in " + numGuesses + " tries!");
                    gameOver = true;
                } else if (guess < randomNumber) {
                    System.out.println("Too low, try again.");
                } else {
                    System.out.println("Too high, try again.");
                }
            }

            System.out.print("Do you want to play again? (y/n): ");
            String playAgain = scanner.next();

            if (playAgain.equalsIgnoreCase("y")) {
                this.randomNumber = generateRandomNumber();
                this.numGuesses = 0;
                this.gameOver = false;
                playGame();
            } else {
                System.out.println("Thanks for playing!");
            }
        }

        public static void main(String[] args) {
            GuessingGame game = new GuessingGame();
            game.playGame();
        }

}
