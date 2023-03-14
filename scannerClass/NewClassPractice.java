package scannerClass;

import java.util.Scanner;

public class NewClassPractice {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Please enter integer from one to ten:");
        int intInput = myObj.nextInt();

        if (intInput >= 0 && intInput <= 10){
            System.out.println("Valid Input !");
        }
        else {
            System.out.println("Invalid Input");
        }



    }
}
