package whileLoop;

import java.util.Scanner;

public class IntroWhileLoop {
    public static void main(String[] args) {

        int i = 1;
/*
        while (i <= 10){
            System.out.println(i);
            i++;         // needs to be updated
        }*/

        //---------------------------------------------

        /*while (i<=10){

            if (i % 2 == 0){
                System.out.println("Good Morning Everyone!");

            }
            i ++;
        }*/
        int b = 0;
        while (b <= 10){
            System.out.println("Good Morning Everyone!");
            b++;
        }


        int c = 100;

        while (c >= 0 ){

            if (c % 2 != 0){
                System.out.println(c);
            }

            c--;

        }

        int d = 1;
        while (d <= 31){
            System.out.println(d + " January 2023!");
            d++;
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int inputNum = sc.nextInt();
        int num2 = 2;


        boolean isPrime = true;

        while (num2 < inputNum){
            if (inputNum % num2 == 0){
                isPrime = false;
                break;
            }
            num2++;

        }
        if (isPrime){
            System.out.println("Prime");

        }
        else {
            System.out.println("Not Prime");
        }





    }
}
