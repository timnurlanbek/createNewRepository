package AllHomeWorks;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class SumOfOddIntegers {
    public static void sumOfOddNumbers(){

        /*
        *Write a program that prompts the user to enter a positive integer.
        *  The program should then use a while loop to compute the sum of all odd integers
        * up to and including the input integer. For example, if the input is 5,
        * the program should compute 1 + 3 + 5 = 9. The program should display the sum of odd integers. */

        /*1) Prompt the user to enter a positive integer
        * 2) loop through every integer from zero until InputInteger while input is more than zero */


        Scanner sc = new Scanner(System.in);
        int inputInt;
        int counter;

        while (true){
            System.out.println("Enter a positive integer:");
            inputInt = sc.nextInt();
            counter = 0;

            if (inputInt <= 0){
                System.out.println("Input must be positive. Please try again.");
            }

            else if (inputInt > 0 ){
                for (int i = 1; i <= inputInt; i++){
                    if (i % 2 != 0){
                        counter = counter + i;
                    }
                }
                System.out.println("Sum of odd integers up to " + inputInt + " is " + counter );
                break;
            }

        }


    }

    public static String comboString(String a, String b) {
        if (a.length() > b.length()){
            return a+b+a;
        }
        return a;
    }

    public static void main(String[] args) {
        sumOfOddNumbers();
        comboString("hello","hi");
    }


}
