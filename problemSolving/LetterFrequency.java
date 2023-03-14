package problemSolving;

import java.util.Locale;
import java.util.Scanner;

public class LetterFrequency {
    public static void main(String[] args) {
        /*1. create scanner
        * 2. ask from user to enter a string
        * 3. create a int counter
        * 4. create for loop to count from zero to the length of the given word
        * 5. give a value zero for the variable counter
        * 6. create another fol loop to count and compare every alphabet for other each alphabet
        * 7. */

        Scanner sc = new Scanner (System.in);

        System.out.println( "Enter a string:");
        String word = sc.nextLine();



        for (int i = 0; i < word.length(); i++) {
            int counter = 0;
            for (int k = 0; k < word.length(); k ++){
                if (word.charAt(i) == word.charAt(k)){
                    counter++;
                }

            }
            System.out.println(word.charAt(i) + ": " + counter);
        }

        System.out.println("Enter first string");
        String str1 = sc.nextLine();

        System.out.println("Enter second String:");
        String str2 = sc.nextLine();

        str1 = str1.substring(0,1).toLowerCase() + str1.substring(1);
        str2 = str2.substring(0,1).toUpperCase() + str2.substring(1);
        System.out.println(str1 + str2);


        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        System.out.println(str1 + str2.toUpperCase().charAt(0) + str2.substring(1));





    }
}
