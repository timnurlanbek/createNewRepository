package AllHomeWorks;

import java.util.Scanner;

public class CountDigits {
    public static void countDigitsInString(){

        Scanner sc = new Scanner(System.in);
        String str1;
        int digitCount;

        do {
            System.out.println("Enter a string with 3 digits: ");
            str1 = sc.nextLine();
            digitCount = 0;
            for (int i = 0; i < str1.length(); i++){
                if (Character.isDigit(str1.charAt(i)) ){
                    digitCount ++;
                }
            }

            System.out.println("Number of digits in "+ str1 + " : " + digitCount);
            if (digitCount == 3){
                System.out.println("You entered a word with 3 digits!");
                System.out.println("Program ended!");
                break;
            }
        }while (str1.length() != 3);


    }














    public static void main(String[] args) {
        /*Create CountDigits class, and using do while loop, write a program that
        prompts the user to enter a string. The program should display the number
        of digits in the string. The program should keep prompting the user to enter
        string until user enters a string with 3 digits.


        1) Do while loop
        2) Create string word
        3) program should display the number of numbers in your string
        5) string == 3 digits*/

        countDigitsInString();










    }


}

