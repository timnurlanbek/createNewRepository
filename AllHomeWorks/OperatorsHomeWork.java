package AllHomeWorks;

public class OperatorsHomeWork {

    // # 1 assignment
    public static void main(String[] args) {
        int a = 100;
        int b = 200;

        int ab = a + b;
        System.out.println("a + b = " + ab);

        // # 2 assignment

        int q = 5;
        int w1 = 9;
        int e1 = 10;

        byte theSumOfQwe = 5 + 9 + 10;
        System.out.println("The sum of " + q + " + " + w1 + " + " + e1 + " = " + theSumOfQwe);






        // #3 assignment
        //using operators and variables, write a program that will print following lines of code:
        //
        //  1 + 2 = 3
        // 3 - 1 = 2
        // 2 * 2 = 4
        // 4 / 2 = 2
        // 2 + 8 = 10
        // 10 % 7 = 3

        byte c = 1;
        byte d = 2;
        byte o = 3;
        byte e = 4;
        byte y = 7;
        byte t = 8;
        byte r = 10;

        String allCodeInOne =
                     "\n" + c + " + " + d + " = " + (byte) (c+d)
                        +"\n" + o + " - " + c + " = " + (byte) (o-c)
                            +"\n" + d + " * " + d + " = " + (byte) (d*d)
                                +"\n" + e + " / " + d + " = " + (byte) (e/d)
                                    +"\n" + d + " + " + t + " = " + (byte) (d+t)
                                        +"\n" + r + " % " + y + " = " + (byte) (r%y);


        System.out.println("allCodeInOne = " + allCodeInOne);


        //Assignment #4
        /*
        Length and width of a rectangle are 9 and 15 respectively.
        Write a program to calculate the area and perimeter of the rectangle.
        Print results as following:
         */

        byte length = 9;
        byte width = 15;

        // Formula
        int areaOfRectangle = length * width;
        int lengthOfRectangle = length + width;

        //output
        System.out.printf(
                "Length and width of a rectangle are 9 and 15 respectively. " +
                "Write a program to calculate " +
                "the area and perimeter of the rectangle. Print results as following: " + "\n");


        System.out.println("The area of the rectangle is = " + areaOfRectangle);
        System.out.println("The length of the rectangle is = " + lengthOfRectangle);


        //Assignment #5
        System.out.println("The result using compound operators : "+2345+8/3%5*5);



        // Assignment #6
        short number1 = 2345;
        number1 += 8;
        number1 /=3;
        number1 %=5;
        number1 *=5;
        System.out.println("number1 = " + number1);

        //Assignment #7
        boolean isEqual = 23 == 45;
        System.out.println("Is 23 and 45 equal = " + isEqual);

        //Assignment #8
        isEqual = -10 == 10;
        System.out.println("Is -10 and 10 equal = " + isEqual);








    }

}
