package just_For_Myself;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame2 {
    // First of all create necessary variables
    /*
    2. Create default methods for variables
    3. Create a method for generating random number
    4. Create a method for playing game while true;
    5. ask one more time to play or not
    6. if yes playGame else thank you
    7. Call the method
     */
    private int guess;
    private int randomNumber;
    boolean gameOver = false;

    public void defaultMethod(){
        this.guess = 0;
        this.randomNumber = generatedNumber();
        this.gameOver = false;
    }


    public static int generatedNumber(){
        Random random = new Random();
        return random.nextInt(100) + 1;
    }


    public void playGame(){
        Scanner scanner = new Scanner(System.in);


        while (!gameOver) {
            System.out.println("Guess a number in the range of 1 and 100");
            int guess = scanner.nextInt();
            this.guess++;

            if (guess == randomNumber){
                System.out.println("Congratulation, you guessed the number in " + this.guess + " times");
                gameOver = true;
            }else if (guess > randomNumber){
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Too low, try again.");
            }
        }


        System.out.println("Do you want to play again? (y/n)");
        String answer = scanner.next();

        if (answer.equalsIgnoreCase("y")){
            this.guess = 0;
            randomNumber = generatedNumber();
            gameOver = false;
            playGame();
        }
        else {
            System.out.println("Thanks for playing!");
        }
    }


    public static void main(String[] args) {
        GuessingGame guessingGame = new GuessingGame();
        guessingGame.playGame();
    }
}
