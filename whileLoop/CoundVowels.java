package whileLoop;

import java.util.Scanner;

public class CoundVowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*write a program that will ask user to enter a string
            and output the number of vowel that string has.
             keep asking user to enter string and outputting the number of vowels,
                       until user enters a string with 10 vowels      | a i e o u
                       i love java => 5, enter another string with 10 vowels
                       codewise =>, enter another

                      enter a str with 10 vowels
                      input: i love you
                      number of vowel is : int vowels
                      "Please enter a str with 10 vowels"

                      if vowels == 10: then break;




                       i love java i love java => 10, good*/
        int counter;
/*
        do {
            System.out.println("Enter a string with only 10 vowels:");
            String inputUser = sc.next();
            counter = 0;

            for (int i = 0; i <= inputUser.length(); i++ ){
                System.out.println(inputUser.charAt(i) == 'a' || inputUser.charAt(i) == 'e' || inputUser.charAt(i) == 'i'
                        || inputUser.charAt(i) == 'o' || inputUser.charAt(i) == 'u');

                counter++;

            }
        }while (counter != 10 );*/



        /*int counter;*/

        /*do {
            System.out.println("Enter 10 vowel string:");
            String inputStr = sc.nextLine();
             counter = 0;

            inputStr = inputStr.toLowerCase();
            for (int i = 0; i < inputStr.length(); i++){
                if (inputStr.charAt(i) == 'a' || inputStr.charAt(i) == 'e' || inputStr.charAt(i) == 'o'
                || inputStr.charAt(i) == 'i' || inputStr.charAt(i) == 'u'){
                    counter++;
                }

            }
            System.out.println("The entered word's vowel count: " + counter);




        }while (counter != 10 );*/
    }
}
