package pracitce;

import java.util.Scanner;

public class AllToLowerCase {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = myObj.nextLine();
        System.out.println(input.toLowerCase());

    }
}
