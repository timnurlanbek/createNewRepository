package AllHomeWorks;

public class OperatorsHomeWork2 {
    public static void main(String[] args) {
        //Assignment #1
        byte a = 7;
        byte b = 12;

        String ab = " The sum of " + a + " and " + b + " is " + (byte) (a+b);
        System.out.println(ab);

        //Assignment #2
        byte a1 = 15;
        byte b1 = 8;
        System.out.println(
                "The difference between " + a1 + " and " + b1 + " is " + (byte) (a1-b1)
        );



        //Assignment #3
        byte a3 = 3;
        byte b3 = 5;
        byte c3 = 7;

        byte theProduct = (byte) (a3 * b3 * c3);

        System.out.println("The product of " + a3 + ", " + b3 + ", and " + c3 + " is " + theProduct);

        //Assignment #4
        byte a4 = 20;
        byte b4 = 5;
        System.out.println("The division of " + a4 + " by " + b4 + " is " + (byte) (a4/b4));


        //Assignment #5
        byte a5 = 27;
        byte b5 = 4;

        //Output
        System.out.printf("The remainder of " + a5 + " divided by " + b5 + " is " + (byte) (a5%b5) + "\n");

        //Assignment #6
        /*
        Write a program that calculates the result of raising an integer, a,
        to a power of b, where a is 2 and b is 5.
         */

        byte a6 = 2;
        byte b6 = 5;
        String c6 ="\n" + a6 + " raised to the power of " + b6 + " is " + (byte) (2*2*2*2*2);
        System.out.println("c6 = " + c6);


        // Assignment #7
        byte a7 = 10;
        byte b7 = 15;
        byte c7 = 20;

        int theAverage = (a7 + b7 + c7)/3;
        System.out.println("theAverage = " + theAverage);


        // Assignment #8
        byte length = 5;
        byte width = 8;

       int theAreaOfRectangle = length * width;
        System.out.println("theAreaOfRectangle = " + theAreaOfRectangle);



        //Assignment #9
        byte sideLength = 6;
        // P=4a a formula of perimeter square

       int perimeterOfSquare = sideLength * 4;
        System.out.println("sideLength = " + sideLength);




    }




}
