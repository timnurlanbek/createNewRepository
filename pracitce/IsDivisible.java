package pracitce;

import java.util.Scanner;

public class IsDivisible {
    public static void main(String[] args) {

        Scanner myInt = new Scanner(System.in);

        System.out.println("Enter a first number:");
        int inputInt = myInt.nextInt();

        System.out.println("Enter a second number:");
        int inputInt2 = myInt.nextInt();

        if (inputInt % inputInt2 == 0){
            System.out.println("Divisible!");
        } else {
            System.out.println("Indivisible!");
        }
    }
}
