package pracitce;

import java.util.Scanner;

public class AtLeastTwoTrue {
    public static void main(String[] args) {

        Scanner myBoolean = new Scanner(System.in);

        System.out.println("Enter three booleans:");
        boolean a = myBoolean.nextBoolean();
        boolean b = myBoolean.nextBoolean();
        boolean c = myBoolean.nextBoolean();


        if (a && b && c){
            System.out.println("All of them are true!");
        }
        else if ((a&&b) || (b&&c) || (c&&a)){
            System.out.println("At least two are true!");
        }
        else {
            System.out.println("less than two are true");
        }
    }
}
