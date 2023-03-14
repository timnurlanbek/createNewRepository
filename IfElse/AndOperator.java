package IfElse;

import java.util.Scanner;

public class AndOperator {
    public static void main(String[] args) {
        if (2 < 3){
            System.out.println("hello");

        }
        if (5 < 10){
            System.out.println("hello");
        }

        //---------------------------------

        if (2 < 3 && 5 < 10){
            System.out.println("bye bye");

        }
        if (false && true){
            System.out.println("potato"); // do not execute, has to be
                                            // either false or true
        }

        // CONDITIONAL / LOGICAL OPERATORS:

        // 1) && = AND
        // 2) & = SINGLE AND
        // 3) || = OR
        // 4) | = SINGLE OR
        Scanner myObj = new Scanner(System.in);
        System.out.println("Tell me your name: ");

        String name = myObj.nextLine();
        System.out.println("Welcome " + name + " it is so much pleasure to meet you!");

        //enteredUsername1 = "sunshine123";




        String actualUserName = "sunshine123";
        String actualPassword = "moonlight456";
        String actualEmail = "sunshine123@gmail.com";

        String enteredUsername = "sunshine123";
        String enteredPassword = "moonlight456!true";
        String enteredEmail = "sunshine123@gmail.com";


        if (actualUserName == enteredUsername && actualPassword == enteredPassword){
            System.out.println("Logged in...");
        }
        else if (actualUserName == enteredUsername && actualPassword != enteredPassword){
            System.out.println("Incorrect password, try again ...");
        }
        else if (actualUserName != enteredUsername) {
            System.out.println("Username does not exist");

        }
        else if (actualUserName != enteredUsername && actualEmail == enteredEmail && actualPassword == enteredPassword){
            System.out.println("Recover username");
        }
        else if (actualUserName == enteredUsername && actualEmail == enteredEmail && actualPassword != enteredPassword){
            System.out.println("Recover password");
        }
        else if (actualUserName == enteredUsername && actualEmail != enteredEmail && actualPassword == enteredPassword){
            System.out.println("Recover email");
        }



    }

    }





