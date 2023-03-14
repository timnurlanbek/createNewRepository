package AllHomeWorks;

import java.util.Scanner;

public class PracticeBreakAndContinue {
    /*
    Divisible by 3 & not by 5
    * Write a program that prompts the user to enter a positive integer. The program should then use a for loop
    * to print all positive integers less than the input integer that are divisible by 3, but not divisible by 5.
    * If the input integer is not positive, the program should display an error message and prompt the user to enter
    * a positive integer. If there are no integers that meet the criteria, the program should display a message indicating
    *  that there are no such integers
    *
    * 1) int positive int
    * 2) if int > 0
    * 2) create for loop (int < input)
    * 3) if int divided by 3 and not by 5 print them
    * 4) else if not positive integer, ask the user to enter positive integer
    * 5) else ask user that there are no such integers*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int int1 = sc.nextInt();

        if (int1 > 2){
            for (int i = 0; i < int1; i ++){
                if (i % 3 == 0 & i % 5 != 0){
                    System.out.println(i);
                }
            }
        }
        else if (int1 < 0){
            System.out.println("Input must be a positive. Please try again.");
        }
        else if (int1 <= 2 || int1 >= 0){
            System.out.println("There are no integers less than 2 that are divisible by 3 but not by 5");
        }
        else {
            System.out.println("There are no such integers");

        }






    }




}
