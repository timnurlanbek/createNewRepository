package AllHomeWorks;

import java.util.Arrays;
import java.util.Scanner;

public class fromLowToHighInt {
    public static void main(String[] args) {
        Scanner myInt = new Scanner(System.in);

        System.out.println("Enter three number:");
        int int1 = myInt.nextInt();
        int int2 = myInt.nextInt();
        int int3 = myInt.nextInt();


      /*  if (int1 < int2 && int1 < int3 && int1 < int4
                && int2 < int3 && int2 < int4 && int3 < int4) {
            System.out.println(int1 + " " + int2 + " " + int3 + " " + int4);


            if (int1 < int2 && int1 < int3 && int1 < int4
                    && int2 < int3 && int2 < int4 && int3 < int4) {
                System.out.println(int4 + " " + int3 + " " + int2 + " " + int1);*/


        if (int1 > int2 && int1 > int3) {
            if ( int2 > int3){
                System.out.println("Descending order: " + int1 + " " + int2 + " " + int3 );
                System.out.println("Ascending order: " + int3 + " " + int2 + " " + int1 );



            }


        }
        else if (int2 > int1 && int2 > int3){
            if (int1>int3){
                System.out.println("Ascending: " + int3 + " " + int2 + " " + int1 );
                System.out.println("Descending: " + int1 + " " + int2 + " " + int3);
            }


        }


    }
}






