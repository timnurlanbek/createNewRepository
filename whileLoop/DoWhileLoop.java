package whileLoop;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
                                                                // difference is this code
        /* runs at least once*/
        /*do {
            System.out.println(i);
            i++;
        } while (i <= 10);*/

        /*do {
            if (i % 2 != 0){
                System.out.println(i);
            }
            i++;
        } while (i <= 100);*/



        /*do {
            if (i % 2 == 0){
                continue;
            }
            else{
                System.out.println(i);
            }
            i++;
        } while (i <= 100);*/


        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter even number: ");
            number = sc.nextInt();
            if (number % 2 != 0){
                System.out.println("No, please enter even num!");
            }
            else {
                System.out.println("Thank you!");
                break;
            }


        } while (number >= 0); // while num more than 0, then run this block of code again and again!

        String inputPass;


    }
    }

