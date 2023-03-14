package IfElse;

import java.util.Scanner;

public class IfElseDay2 {
    public static void main(String[] args) {

        Scanner myInt = new Scanner(System.in);
        System.out.println("Enter an hour:");

        int time = myInt.nextInt();
        

        
        if ( time >= 9 & time <= 17){
            System.out.println(" WORK HOURS");   // if hour more than 9 and less 17
            
        }
        else if ( time >= 7 && time <= 9 || time >= 18 & time <= 19) {            // We will use OR ||
            System.out.println("COMMUTE HOURS");                                    // more than 7 n less than 9 or more 18 n less 19
            
        }
        else if (time >= 6 && time <= 8){
            System.out.println("BREAKFAST TIME");

        }
        else if (time >= 12 && time <= 13) {
            System.out.println("LUNCH TIME");

        }
        else if (time >= 20 && time <= 22){
            System.out.println("DINNER TIME");

        } else if (time >= 22 && time <= 24) {
            System.out.println("LATE HOURS");


        }
        else if (time >= 0 && time <= 6){
            System.out.println("SLEEP TIME");

        }
        else {
            System.out.println("INVALID TIME");
        }
    }
}
