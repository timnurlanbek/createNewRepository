package AllHomeWorks;

import java.util.Scanner;

public class CampareInts {
    public static void main(String[] args) {
        Scanner myInt = new Scanner(System.in);

        System.out.println("Enter three number:");
        int int1 = myInt.nextInt();
        int int2 = myInt.nextInt();
        int int3 = myInt.nextInt();

        if (int1 > int2 & int1 > int3){
            System.out.println(int1 + " is the largest one");
        }
        else if (int2 > int1 & int2 > int3){
            System.out.println(int2 + " is more than others");
        }
        else if ( int3 > int1 & int3 > int2) {
            System.out.println(int3 + " is more than others");
        }
        else {
            System.out.printf("I don't understand you!");
        }
    }
}
