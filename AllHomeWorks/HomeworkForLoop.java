package AllHomeWorks;

public class HomeworkForLoop {
    public static void main(String[] args) {

        // Write a Java program to print the
        // numbers which are divisible by 5, from 1 to 50 using a for loop.

        for (int i = 1; i <= 50; i ++){
            if (i % 5 == 0){
                System.out.println(i);
            }

        }
        System.out.println("These are integers divisible by five");

        /*Write a Java program to print the even numbers from 2 to 20 using a for loop.*/
        for (int i = 2; i <= 20; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        System.out.println("Above are the even numbers from 2 to 20");

        // Write a Java program to
        // print the first 10 natural numbers in reverse order using a for loop.

        for (int n = 10; n >= 1; n --){
            System.out.println(n);
        }
        System.out.println("Above natural numbers from 10 to 1");



        //Write a Java program to print the multiplication table of 5 using a for loop.
        for (int i = 1; i <= 10; i ++ ){

            System.out.println(5 + " * " + i + " = " + (5*i));

        }
        System.out.println("Above is the table of multiplication of 5");

        /*
        * Write a Java program to print the first 20 odd numbers using a for loop*/
        for (int i = 1; i <= 20; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }

        }
        System.out.println("Above are first twenty odd numbers");


        /*Write a Java program to calculate the sum of
         the first 50 even numbers using a for loop.*/

        // 2 + 4 + 6 + 8 + 10 + 12 + 14 ... + 50 == xx
        // we will add a counter for an even numbers
        int counter = 0;
        for ( int i = 1; i <= 50; i++){
            if (i % 2 == 0){
                 counter = counter + i;
            }
        }
        System.out.println(counter + " is the sum of even numbers from 1 to 50!");



        /*Write a Java program to calculate the sum of the digits of a given number
        using a for loop. For example, if the number is 1234, the program should output
        10 (1 + 2 + 3 + 4).*/


        int givenNumber = 4;
        int counter3 = 0;
        for (int i = 0; i <= givenNumber; i ++){
            counter3 = counter3 + i;

        }
        System.out.println(counter3 + " is the sum of the given number!");





        /*Write a Java program to print the following pattern using nested for loops:
         *****

         ****

         ***

         **

         *
        */
        for (int i = 5; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }



        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }



    }
}

