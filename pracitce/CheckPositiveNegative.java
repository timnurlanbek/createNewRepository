package pracitce;

import java.util.Scanner;

public class CheckPositiveNegative {
    public static void main(String[] args) {

        Scanner myInt = new Scanner(System.in);

        System.out.println("Enter a number:");
        int x = myInt.nextInt();

        System.out.println("Enter a second number:");
        int y = myInt.nextInt();

        if (x > 0 && y > 0 ){
            System.out.println("Both more than zero");
        }
        else if (x == 0 || y == 0){
            System.out.println("Either x or y is zero");
        }
        else if (x < 0 && y < 0 ) {
            System.out.println("Both are negative!");
        }
        else if (x < 0 || y < 0){
            System.out.println("Either y or x is negative!");
        }
        else{
            System.out.println("I can't get you, brother!");
        }
    }
}
