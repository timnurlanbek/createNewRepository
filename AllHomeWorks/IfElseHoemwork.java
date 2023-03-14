package AllHomeWorks;

import java.util.Scanner;

public class IfElseHoemwork {
    public static void main(String[] args) {

        Scanner myInt = new Scanner(System.in);
        System.out.println("Enter a number: Negative or Positive!");

        int number = myInt.nextInt();


        if (number > 0 ){
            System.out.println(number + " is positive!");

        }
        else if (number == 0 ){
            System.out.println(number + " is zero!");
        }
        else if (number < 0) {
            System.out.println(number + " is negative!");
        }

        //-----------------------------------------------------
        //

        int year = 2016;

        if (year % 4 == 0){
            if (year % 100 != 0){
                System.out.println(year + " is leap year!");
            }

        }
        else {
            System.out.println(year + " is not a leap year!");
        }

        //====================================================

        int num1 = 332;
        int num2 = 123;

        if ( num1 > num2) {
            System.out.println(num1 + " is more than " + num2);
        }
        else if (num2 > num1) {
            System.out.println(num2 + " is more than " + num1);

        }
        else if (num2 == num1){
            System.out.println(num1 + " is equal to " + num2);

        }
        else {
            System.out.println("I don't get you!");
        }
        //==================================================

        double tempInFahrenheit = 77.3;

        if (tempInFahrenheit < 32){
            System.out.println("Weather is freezing!");
        }
        else if (tempInFahrenheit > 212){
            System.out.printf("Weather is boiling!");
        }
        else if (tempInFahrenheit > 32 && tempInFahrenheit < 212){
            System.out.printf("Weather is more than 32 and less than 212!. Which means normal!");
        }
        else {
            System.out.printf("I don't get you!");
        }

        //--------------------------------------------------

        byte month = 3;

        if (month == 3 || month == 4 || month == 5){
            System.out.printf("It's Spring");
        }
        else if (month == 6 || month == 7 || month == 8){
            System.out.printf("It's Summer ");
        }
        else if (month == 9 || month == 10 || month == 11){
            System.out.printf("It's Autumn!");
        }
        else if(month == 12 || month == 1 || month == 2){
            System.out.printf("It's Winter!");
        }
        else {
            System.out.printf("Please enter only monthly numbers!");
        }

        //----------------------------------------------


    }
}
