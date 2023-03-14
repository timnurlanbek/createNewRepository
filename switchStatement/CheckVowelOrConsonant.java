package switchStatement;

import scannerClass.ScannerHasNext;

import java.util.Scanner;

public class CheckVowelOrConsonant {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

//        System.out.printf("Enter an alphabet!:");

        char char1 = 'B';

        switch (char1){
            case 'A','E','I','O','U','Y','a','e','i','o','u','y':
                System.out.println("Vowel");
                break;
            default:
                System.out.printf("Consonant!");
                break;
        }

        System.out.println("Please enter your grade: A,B,C,D, or F");
        String input1 = myObj.nextLine();

        switch (input1){
            case "A":
                System.out.println("Excellent!");
                break;
            case "B":
                System.out.println("Good Job!");
                break;
            case "C":
                System.out.println("Not Bad!");
                break;
            case "D":
                System.out.println("You Failed!");
            default:
                System.out.println("Please enter only grades!");
        }




    }
}
