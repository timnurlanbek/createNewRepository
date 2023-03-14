package whileLoop;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

       /* create a program that will keep asking a user to enter positive numbers,
                until negative number is entered.
        2,4,5,6,7,8,8,8,-7.

        Enter a positive number (or negative to quit): 5
        Enter a positive number (or negative to quit): 5
        Enter a positive number (or negative to quit): 9
        Enter a positive number (or negative to quit): 11
        Enter a positive number (or negative to quit): -8

        The average of all numbers: 7.5
        The sum of all numbers: 30
        You entered this number at least twice: 5
        (optional) The largest number is: 11
        (optional) The smallest number is: 5*/


        Scanner sc = new Scanner(System.in);
        boolean yesNo = true;
        int inputInt;
        do {
            System.out.println("Enter numbers and a negative number:");
            inputInt = sc.nextInt();

            if (inputInt > 0){
                System.out.println(inputInt);

            }
            else if (inputInt == 0){
                continue;
            }
            else if (inputInt < 0){
                break;
            }

        }while (inputInt < 0);
    }
}
