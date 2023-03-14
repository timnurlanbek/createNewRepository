package problemSolving;

import java.util.Scanner;

public class ReversedWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word to reverse:");
        String reversedWord = sc.nextLine();

        for (int i = reversedWord.length()-1; i >= 0; i-- ){
            System.out.print(reversedWord.charAt(i));

        }
        System.out.println("\n");

        for (int i = reversedWord.length()-1; i >= 0; i--){
            System.out.print(reversedWord.charAt(i));
        }


        for (int i = reversedWord.length()-1; i >= 0; i--){
            System.out.print(reversedWord.charAt(i));
        }


        for (int i = reversedWord.length()-1; i >= 0; i--){
            System.out.println(reversedWord.charAt(i));

        }



        for (int i = reversedWord.length()-1; i >= 0; i--){
            System.out.println(reversedWord.charAt(i));
        }


    }
}
