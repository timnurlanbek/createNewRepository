package pracitce;

import java.util.Scanner;

public class AllVowelsToX {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String inputSentence = myObj.nextLine();
        String vowels = "a e i o u y A E I O U Y";

        inputSentence = inputSentence.replaceAll("[a,e,i,o,u,y]","X");

        System.out.println("inputSentence = " + inputSentence);

        /* Primitives
        * byte => Byte
        * short => Short
        * so on..*/


    }
}
