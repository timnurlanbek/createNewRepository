package whileLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean yesNo = true;
        do {
            System.out.println("Enter your first number:");
            int num1 = sc.nextInt();


            System.out.println("Enter an operator: *,/,+,-");
            String operators = sc.next();


            System.out.println("Enter your second number:");
            int num2 = sc.nextInt();

            if (operators.contains("*")){
                System.out.println(num1 + " * " + num2 + "= " +(num2 * num1));
            }
            else if (operators.contains("/")){
                System.out.println((num1 / num2));
            }
            else  if (operators.contains("+")){
                System.out.println((num1 + num2));
            }
            else if (operators.contains("-")){
                System.out.println((num1 - num2));
            }
            else {
                System.out.println("Did not catch you!");
            }

            System.out.println("Would you like to try again? true/false");
            yesNo = sc.nextBoolean();




        }while (yesNo);
    }
}
