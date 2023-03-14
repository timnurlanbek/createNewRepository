package Strings;

public class StringToLowerCase {
    public static void main(String[] args) {

        String word = "Hello EveryONE! HOW ARE you Doing?";
        System.out.println("word = " + word);

        word = word.toLowerCase();
        System.out.println("word = " + word);


        String word2 = "hello guys, I am good, and you?";
        System.out.println("word2 = " + word2);


        word2 = word2.toUpperCase();
        System.out.println("word2 = " + word2);


       String word3 = "hello everyone";
       String word4 = "HELLO EVERYONE";

        System.out.println(word3.equalsIgnoreCase(word4));
        System.out.println("word4.toLowerCase() = " + word4.toLowerCase());

// Functions, methods are upper case , equals, equalsignorecase






    }
}
