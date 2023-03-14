package scannerClass;

import java.util.Scanner;

public class ScannerMultiplicationClass {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println(" Please enter first number to multiply:");
        int first_int = myObj.nextInt();

        System.out.println("Pleas enter second number:");
        int second_int = myObj.nextInt();
        System.out.println("The result is: " + (first_int * second_int));


        //--------------------------------------------------------



    }
}
