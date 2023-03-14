package AllHomeWorks;

import java.util.Scanner;

public class SelfPracticeInputIfElse {
    public static void main(String[] args) {

       // Scanner sc = new Scanner(System. in);
       // System.out.print("Enter your name : ");

      //  String name = sc. next(); // Input for a name, string
      //  System.out.print("Enter your age : ");
       // int age = sc. nextInt(); // Input for an age, for integer
      //  System.out.printf("Hi %s, you are %d years old, it's time you learned Java%n", name, age);
       // System.out.printf("Hi %s, you are %d years old", name, age);



        //------------------------------------------------------------

        /*Scanner someInt = new Scanner(System.in);
        System.out.printf("\n----------------------------");
        System.out.printf("\nEnter a name:");
*/
      // int inputInt = someInt.nextInt();

       //boolean isEqual = inputInt == 5;
        //System.out.println("isEqual = " + isEqual);;

       /* String inputName = someInt.next();
        boolean isEqual = inputName.equals("Tim");
        System.out.println("isEqual = " + isEqual);*/

        //System myObj

        for (int i = 1; i <= 5; i++){
            for (int k = 5; k >= i; k--){
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 1; i <= 4; i++){
            for (int k = 1; k <=i; k++){
                System.out.print(i);
            }
            System.out.println("");
        }

    }
}
