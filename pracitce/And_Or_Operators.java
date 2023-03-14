package pracitce;

import java.util.Scanner;

public class And_Or_Operators {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter a boolean: true/false");
        boolean a = myObj.nextBoolean();

        System.out.println("Enter a boolean: true/false");
        boolean b = myObj.nextBoolean();

        if (a == true && b == false){
            System.out.println("A is true, B is false");
        }
        else if (a == false && b == true){
            System.out.println("A is false, B is true");

        }
        else if (a == true && b == true){
            System.out.println("Both are true");
        }
        else if (a == true || b == true){
            System.out.println("Either A or B true");

        }
        else if (a == false && b == false){
            System.out.println("Both a and B are false");
        }
        else {
            System.out.println("I don't understand you!");
        }
    }
}
