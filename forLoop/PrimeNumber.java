package forLoop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
       // IsPrime2();

        //Write a Java program to check whether a
        // given number is a prime number or not.


        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check Prime or Not:");
        int inputPrime = sc.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < inputPrime; i++) {

            if (inputPrime % i == 0) {
                isPrime = false;
                break;
            }


        }
        if (isPrime) {
            System.out.println("Number is Prime");

        } else {
            System.out.println("Number is not a Prime");
        }*/

        // Fibonacci numbers 0 1 1 2 3 5 8 13 21 34 55 110;
    }


    public static boolean IsPrime2(int boolean1) {
        int inputPrime = 71;
        for (int i = 2; i < inputPrime; i++) {

            if (inputPrime % i == 0) {
                return false;

            }

        }
        return true;
    }


}
