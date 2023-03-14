package whileLoop;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int randomNumber = new Random().nextInt(1,100);
        int num;

        do {
            System.out.println("Guess a number in the range of 1 to 100:");
            num = sc.nextInt();

            if (randomNumber > num){
                System.out.println("Num is bigger. Try again:");
            }
            else if (randomNumber < num){
                System.out.println("Num is lower. Try again:");
            }
            else if (randomNumber == num){
                System.out.println("Yes. You guessed this!");
                break;
            }
        }while (num != randomNumber);


        /*write a program that will ask user to enter a string
            and output the number of vowel that string has.
             keep asking user to enter string and outputting the number of vowels,
                       until user enters a string with 10 vowels      | a i e o u*/



        }
    }

