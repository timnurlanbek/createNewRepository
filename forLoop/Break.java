package forLoop;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int inputInt = sc.nextInt();
        int limit = 40;

        for (int int1 = 0; int1 <= inputInt ; int1 ++){
            if (int1 > limit){            //
                break;                   // jump out of the loop means break:
            }
            System.out.println(int1);
        }

        System.out.printf("After loop");
    }

}
