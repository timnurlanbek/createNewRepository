package IfElse;

public class IntroToIfElse {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println(" I will compare a and b below >>");

        if (a < b){
            System.out.println(" A is less than B"); // false   10 is less than 5

        }
        else {
            System.out.println("B is less than A"); // true 5 is less than 10
        }


        int num1 = 100;
        int num2 = 50;
        // IF ELSE have to be always boolean
        if(num1/num2 == 2){
            System.out.println("YES, two!");

        }
        else {
            System.out.println("Not two!");

        }



        String elon = "Tesla SpaceX Paypal Twitter";

        //if (elon.contains("Paypal")){
          //  System.out.println("Elon owned Paypal!"); // true
         //   }

     //   else {
          //  System.out.println("elon = " + elon);



        //=================================================================

        short password = 2270;
        if (password == 270){
            System.out.println(" Yes, password is correct!");
        }
        else {
            System.out.println("Try again");
        }


        int number1 = 123431234;
        int number2 = 432423;
        System.out.println("Below I will compare " + number1 + " and " + number2);
        if (number1 >= number2){
            System.out.println("Yes, number one is more than number2");
        }
        else {
            System.out.println("No, Number1 is less than number2");
        }





    }
}
