package just_For_Myself;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumber4 {

    private int guess;

    private int randomNumber;

    private boolean gameOver ;


    public void byDefault(){
        guess = 0;
        randomNumber = GeneratedRandomNumber();
        gameOver = false;

    }

    public static int GeneratedRandomNumber(){
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    public void playGame(){
        Scanner scanner = new Scanner(System.in);

        while (!gameOver){

            System.out.println("Guess number between 1 and 100:");
            int guessInput = scanner.nextInt();
            guess ++;

            if (guessInput == randomNumber){
                System.out.println("Congrats! You guessed the number in " + guess + " times");
                gameOver = true;
            } else if (guessInput > randomNumber) {
                System.out.println("Too high. Try again");
            } else {
                System.out.println("Too low. Try again");
            }

        }

        String oneMoreInput = scanner.next();
        System.out.println("Do you want to play again? (y/n");

        if (oneMoreInput.equalsIgnoreCase("y")){
            guess =0;
            GeneratedRandomNumber();
            playGame();
            gameOver = false;
        }
        else {
            System.out.println("Thank you for playing!");
        }

    }


    public static void main(String[] args) {
        GuessingNumber4 guessingNumber4 = new GuessingNumber4();
        guessingNumber4.playGame();
    }
}
