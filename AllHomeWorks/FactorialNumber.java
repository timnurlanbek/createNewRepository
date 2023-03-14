package AllHomeWorks;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        /*
        * scanner
        * create factorial int
        * 3. create if (more than zero)
        * 4. then create for loop from five to 1
        * 5. give condition like: to multiply factorial to every iteration
        * 6. outside for loop block of code print factorial
        * 7. else input is less than zero, ask user to enter only positive num! */


        //=------------------------------------------------------

        // with while loop the same but with the condition of while loop

        Scanner sc = new Scanner(System.in);

        int number = 5;
        int factorial = 1;

        /*if (number > 0 ){
            for (int i = number; i > 0; i --){
                factorial *= i;

            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
        else {
            System.out.println("Number must be positive!");
        }*/


        // ---------------------------------------------------------

        if (number > 0){
            int i = 1;
            int factorial1 = 1;
            while (number > 0){
                factorial1 *= i;
                i ++;
                number --;
            }
            System.out.println(factorial1);

        }
        else {
            System.out.println("Enter only positive number;");
        }





    }
}
