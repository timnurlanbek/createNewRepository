package AllHomeWorks;

import java.util.Scanner;

public class lengthOfString {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str1 = myObj.nextLine();

        System.out.println("Enter a second string:");
        String str2 = myObj.nextLine();

        str2 = str2.substring(0,1).toUpperCase() + str2.substring(1);
        System.out.println(str1 + str2);
    }
}
