package pracitce;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter first string:");
        String str1 = myObj.nextLine();

        System.out.println("Enter a second string:");
        String str2 = myObj.nextLine();

        System.out.println("Str1 and Str2 are the same: " + str1.equals(str2));
    }
}
