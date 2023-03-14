package pracitce;

import java.util.Scanner;

public class contains_Java {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter any word:");
        String word = myObj.nextLine();

        if (word.toLowerCase().contains("java")){
            System.out.println("Yes, contains Java");

        }
        else {
            System.out.println("No, doesn't contain Java");
        }
    }
}
