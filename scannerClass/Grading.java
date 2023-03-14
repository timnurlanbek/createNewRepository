package scannerClass;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Please enter your point in order to know your grade:");
        int grade = myObj.nextInt();

        if (grade >= 0 && grade <= 20) {
            System.out.println("Bad, study everything again!");

        } else if (grade > 20 && grade <= 50) {
            System.out.println("Okay, your grade is not bad. But you need to try again!");

        } else if ((grade > 50 && grade <= 70)) {
            System.out.println("Bad, study everything again!");

        } else if ((grade > 70 && grade <= 90)) {
            System.out.println("Good, you are zoorgo passed");

        } else if (grade > 90 && grade <= 100 ) {
            System.out.println("Excellent! You passed the exam!");
        } else {
            System.out.println("Please enter only points from 0 to 100:");
        }
    }
}