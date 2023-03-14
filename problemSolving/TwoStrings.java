package problemSolving;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TwoStrings {
    public static void main(String[] args) {


        Scanner sc = new Scanner (System.in);

        System.out.println("Enter first string");
        String str1 = sc.nextLine();

        System.out.println("Enter second String:");
        String str2 = sc.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        System.out.println(str1 + str2.toUpperCase().charAt(0) + str2.substring(1));

    // ---------------------------------------------------

        System.out.println(str1.toUpperCase() + " " + str2.toLowerCase() + " "+ str2.toLowerCase() + " " + str1.toUpperCase());

        //---------------------------------------------------
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        System.out.println(str1.replace("A","") + " " + str2.replace("A", ""));

        str1 = str1.toUpperCase().charAt(0) + str1.substring(1);
        str2 = str2.toUpperCase().charAt(0) + str2.substring(1);
        System.out.println(str1.substring(0,2) + str2.substring(0,2));

       // ==================================================================

        System.out.println(str1.length()-2);
        System.out.println(str2.length()-2);
        System.out.println(str1.toUpperCase().charAt(3) + str1.substring(4)
        + str2.toUpperCase().charAt(4) + str2.substring(5));



        //----------------------------------------------

        System.out.println(""+str1.toUpperCase().charAt(0) + str2.toUpperCase().charAt(0));

        // ========================================================





    }
}
