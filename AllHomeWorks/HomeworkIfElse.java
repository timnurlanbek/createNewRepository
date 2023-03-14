package AllHomeWorks;
import scannerClass.ScannerHasNext;

import java.util.Scanner;
public class HomeworkIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter any 3 numbers:");
        int inputInt1 = scanner.nextInt();
        int inputInt2 = scanner.nextInt();
        int inputInt3 = scanner.nextInt();

        if (inputInt3 == inputInt2) {
            System.out.println(inputInt3 + " equals " + inputInt2);
            {
                if (inputInt3 == inputInt1) {
                    System.out.printf(inputInt3 + " equals " + inputInt1);
                }

            }
        } else if (inputInt2 == inputInt1) {
            System.out.println(inputInt2 + " equals " + inputInt1);
            {
                if (inputInt2 == inputInt3) {
                    System.out.printf(inputInt2 + " equals " + inputInt3);

                }
            }
        } else if (inputInt1 == inputInt2) {
            System.out.println(inputInt1 + " equals " + inputInt2);
            {
                if (inputInt1 == inputInt3) {
                    System.out.printf(inputInt1 + " equals " + inputInt3);
                }
            }
        }
        else {
            System.out.printf("There no equals");
        }
        //--------------------------------------------------------

        //Task 2.
        System.out.println("Enter a number:");
        int int2 = scanner.nextInt();

        if (int2 % 3 == 0 || int2 % 5 == 0 ){
            System.out.println("Multiple by 3 or 5");
        }
        else {
            System.out.println("Not multiple of 3 or 5 ");
        }

        //====================================================
        // Task 3.
        System.out.println("Enter your first integer:");
        int int3 = scanner.nextInt();

        System.out.println("enter your second integer:");
        int int4 = scanner.nextInt();

        int int5 = int3 + int4;
        if (int5 % 2 == 0 ){
            System.out.println("The sum of your two integers is Even");
        }
        else if (int5 % 2 != 0){
            System.out.println("The sum of your two integers is Odd");
        }
        else {
            System.out.println("I didn't get you!");
        }

        //----------------------------------------------------
        // Task 4.

        System.out.println("Please enter an integer: Check Prime or Not Prime:");
        int primeNotPrime = scanner.nextInt();

        if (primeNotPrime / 1 == 1 && primeNotPrime / primeNotPrime == 1 ){
            System.out.println(primeNotPrime + " is Prime!");
        }
        else {
            System.out.println("Not Prime"); // with only if else I could not solve this problem!
            //
        }



    }
}
