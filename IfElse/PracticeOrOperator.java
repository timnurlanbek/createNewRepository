package IfElse;

import java.util.Scanner;

public class PracticeOrOperator {
    public static void main(String[] args) {
        // | = OR
        // || = OR
        // Whenever AT LEAST one true, statement will be true
        // && = and is more turned to FALSE
        // || = or is more turned to TRUE

        // suu = true
        // chai = false
        //  chai || suu = true
        // chai && suu = false

        Scanner myObj = new Scanner(System.in);


        System.out.println("Please print one of the items below: \n" +
                "pizza and lagman tea break cake coffee water and soda pizza smoothie pasta plov:\n");
        String items = "pizza and lagman tea break cake coffee water and soda pizza smoothie pasta plov";




        String menu = myObj.next();

        if (menu.contains("pizza") && menu.contains ("and") && menu.contains("soda")){
            System.out.println("Pizza and Soda");
        }
        else if (menu.contains("tea") && menu.contains("cake")){
            System.out.println("dessert");

        }
        else if (menu.contains("lagman") && menu.contains("tea")){
            System.out.println("lagman and tea, asian is here");

        }
        else if (menu.contains("coffee") && menu.contains("smoothie")){
            System.out.println("BREAKFAST TIME");
        }
        else if (menu.contains("pizza") || menu.contains("pasta")){
            System.out.println("Italian day");
        }
        else if (menu.contains("tea") && menu.contains("coffee") || menu.contains("water") && menu.contains("soda")){
            System.out.println("order only drinks");
        }
        else if (menu.contains("lagman") && !menu.contains("plov")){
            System.out.println("Not Uzbek restaurant");
        }
        else{
            System.out.println("false");
        }

    }
}
