package ArithmeticOperators;

public class ComparisonOperator {
    public static void main(String[] args) {
        /*
        Comparison operators are used to compare two values
        > more than
        < less than
        >= more or equal
        <= less or equal
        == equal
        != not equal
         */
        byte potato = 5;
        byte fries = 10;

        System.out.println(potato > fries);
        System.out.println(fries > potato);
        System.out.println(potato >= fries);
        System.out.println(potato <= fries);
        System.out.println("fries = " + fries);
        System.out.println(potato == potato);
        System.out.println(potato != potato);

        byte byte_first = 3;
        byte byte_second = 5;
        short short_first = 1;
        short short_second = 2;
        int int_first = 134;
        int int_second = 150;
        long long_first = 1234345L;
        long long_second = 12343214L;

        System.out.println(byte_first > byte_second);
        System.out.println(byte_first > short_first);
        System.out.println(byte_first < int_first);
        System.out.println(byte_second == long_second);

        boolean Isbigger = true;

        System.out.println("Isbigger = " + Isbigger);
        // ctrl + W = chooses whole text

        //-----------------------------------------------------------------

        /*
        from UP to DOWN//// top to button, left to right
        from LEFT to RIGHT
        java reads
        ex:


         */
        System.out.println(1 + 2);
        System.out.println("hello" + 1 + 2);
        System.out.println("hello" + 3 + true);






    }
}
