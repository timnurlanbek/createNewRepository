package just_For_Myself;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumber3 {
    private int guess;
    private int randomNumber;
    private boolean gameOver;

    public void defaultSet(){
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


        while (!gameOver){

            System.out.println("Guess the number between 1 and 100: ");
            int inputGuess = scanner.nextInt();
            this.guess ++;

            if (inputGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the number in " + this.guess + " times.");
                gameOver = true;
            } else if (inputGuess > randomNumber) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Too low. Try again.");
            }
        }

        System.out.println("Do you want to play one more time?. (y/n)");
        String oneMore = scanner.next();

        if (oneMore.equalsIgnoreCase("y")){
            this.guess = 0;
            randomNumber = generatedNumber();
            gameOver = false;
            playGame();
        } else {
            System.out.println("Thank you for playing!");
        }


    }

    public static void main(String[] args) {
        GuessingNumber3 guessingNumber3 = new GuessingNumber3();
        guessingNumber3.playGame();
    }
}
