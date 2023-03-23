package problemSolving;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        /*1. string
        * 2. create for loop
        * 3. reverse a word
        * 4. compare to an orgininal word
        * 5. create if else
        * 6. if equal than palindrome else not polindrome*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a str:");
        String word = scanner.nextLine();


        int length = word.length();
        boolean isPalidrome = true;

        for (int i = 0; i < length ; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                isPalidrome = false;
                break;
            }
        }
        System.out.println("Is " + word + " palindrome : " + isPalidrome);











    }
}


