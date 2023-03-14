package IfElse;

import java.util.Scanner;

public class IfIf {
    public static void main(String[] args) {
       Scanner myObj = new Scanner(System.in); // Create a Scanner obj
       System.out.println("Enter username: ");

       String userName = myObj.nextLine(); // Read user input
        System.out.println("Username is: " + userName); //Output user input





        //--------------------------------------------------------------------

        String weather = "warm and rainy";

        if (weather.equals("cold")){
        System.out.println("hot, stay home!");
        }
        else if (weather.equals("warm")){
            System.out.println("warm, go out");

        } else if (weather.equals("rainy")) {
            System.out.println("rainy, stay home!");
        }
        else {
            System.out.println("party hard!");
        }

        System.out.println("Below we check mood of weather1");
        String weather1 = "warm and rainy";

        if (weather.contains("cold")){
        System.out.println("hot, stay home!");
        }
        else if (weather.contains("warm")){
            System.out.println("warm, go out");

        } else if (weather.contains("rainy")) {
            System.out.println("rainy, stay home!");
        }
        else {
            System.out.println("party hard!");
        }



    }
}
