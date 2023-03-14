package scannerClass;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter any number:");
        double num1 = userInput.nextDouble();

        System.out.println("Enter arithmetic operator: / * + - %");
        String arithmeticOperator = userInput.next();

        System.out.println("Enter any second number:");
        double num2 = userInput.nextDouble();


        if (arithmeticOperator.equals("/")){
            System.out.println((num1 + "/ " + num2 + " = " + (num1/num2)));
        }
        else if (arithmeticOperator.equals("*")){
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        }
        else if (arithmeticOperator.equals("+")){
            System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        }
        else if (arithmeticOperator.equals("-")){
            System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        }
        else if (arithmeticOperator.equals("%")){
            System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
        }
        else {
            System.out.println("The operator is invalid, please enter / * + -");
        }
    }
}
