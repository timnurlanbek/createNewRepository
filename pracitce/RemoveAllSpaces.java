package pracitce;

import java.util.Scanner;

public class RemoveAllSpaces {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("enter a sentence:");
        String input = myObj.nextLine();

        System.out.println(input.replace(" ",""));

    }
}
