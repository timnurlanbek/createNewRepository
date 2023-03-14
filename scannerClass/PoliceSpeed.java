package scannerClass;

import javax.swing.*;
import java.util.Scanner;

public class PoliceSpeed {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);


        System.out.println("Is it your birthday today? Yes or No:");
        String birthdayYesNo = myObj.nextLine();


        System.out.println("What was your speed? Enter only your speed:");
        int speed = myObj.nextInt();



        if (birthdayYesNo.equals("yes") || birthdayYesNo.equals("Yes")){
            if (speed < 60 ){
                System.out.println("No ticket");
            }
            else if (speed >= 60){
                System.out.println("OOk. Today is your birthday, so your ticket is zero for you");
            }
            else if (speed >= 80 ){
                System.out.println("OOk. Today is your birthday, so your ticket is small");

            }
            else if (speed >= 100 ){
                System.out.println("OOk. Today is your birthday, so your ticket is Medium");
            }
            else {
                System.out.println("Please enter normal speed! From 0 to 200:"); }



        }   else if (birthdayYesNo.equals("no") || birthdayYesNo.equals("No")) {
            if (speed <= 60 ){
                System.out.println("No ticket");
            }
            else if (speed >= 80){
                    System.out.println("Medium ticket is for you");
            }
            else if (speed >= 100){
                System.out.println("Your ticket is Large!");
            }
            else {
                System.out.println("Please enter normal speed");
            }
        } else {
            System.out.println("Please enter normal speed!");
        }
}
}


