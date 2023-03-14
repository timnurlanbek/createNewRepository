package AllHomeWorks;

public class PracticeVariableCasting {
    public static void main(String[] args) {
        //1. create and assign different values to 1 byte,
        // 1 short, 1 int, 1 long, 1 float, 1 double variables

        byte thisThisMyFirstByte = 127;
        short thisMyShort = 32688;
        int thisMyInt = 234324234;
        long thisLong = 123412421432142314L;
        float thisIsMyFloat = 1.24324F;
        double thisIsMyDouble = 123432.123423;


        // 2. one by one, assign short, int, long,
        // float, double variable values to byte. Cast values if needed


        thisMyShort = thisThisMyFirstByte;
        System.out.println("thisMyShort = " + thisMyShort);

        thisMyInt = thisThisMyFirstByte;
        System.out.println("thisMyInt = " + thisMyInt);

        thisLong = thisThisMyFirstByte;
        System.out.println("thisLong = " + thisLong);

        thisIsMyFloat = thisThisMyFirstByte;
        System.out.println("thisIsMyFloat = " + thisIsMyFloat);

        thisIsMyDouble = thisThisMyFirstByte;
        System.out.println("double = " + thisIsMyDouble);


        //3. one by one, assign byte, int, long, float,
        // double variable values to short. Cast values if needed.

        thisThisMyFirstByte = (byte) thisMyShort;
        System.out.println("thisThisMyFirstByte = " + thisThisMyFirstByte);

        thisMyInt = thisMyShort;
        System.out.println("thisMyInt = " + thisMyInt);

        thisLong = thisMyShort;
        System.out.println("thisLong = " + thisLong);

        thisIsMyFloat = thisMyShort;
        System.out.println("thisIsMyFloat = " + thisIsMyFloat);

        thisIsMyDouble = thisMyShort;
        System.out.println("thisIsMyDouble = " + thisIsMyDouble);


        //4. one by one, assign short, byte, long, float,
        //double variable values to int. Cast values if needed.

        thisMyShort = (short) thisMyInt;
        System.out.println("thisMyShort = " + thisMyShort);

        thisThisMyFirstByte = (byte) thisMyInt;
        System.out.println("thisThisMyFirstByte = " + thisThisMyFirstByte);

        thisLong = thisMyInt;
        System.out.println("thisLong = " + thisLong);

        thisIsMyFloat = thisMyInt;
        System.out.println("thisIsMyFloat = " + thisIsMyFloat);

        thisIsMyDouble = thisMyInt;
        System.out.println("thisIsMyDouble = " + thisIsMyDouble);


        //5. one by one, assign short, int, byte, float,
        //double variable values to long. Cast values if needed.

        thisMyShort = (byte) thisLong;
        System.out.println("thisIsMyShort = " + thisMyShort);

        thisMyInt = (byte) thisLong;
        System.out.println("thisMyInt = " + thisMyInt);

        thisThisMyFirstByte = (byte) thisLong;
        System.out.println("thisThisMyFirstByte = " + thisThisMyFirstByte);

        thisIsMyFloat = thisLong;
        System.out.println("thisIsMyFloat = " + thisIsMyFloat);

        thisIsMyDouble = thisLong;
        System.out.println("thisIsMyDouble = " + thisIsMyDouble);



        //6. one by one, assign short, int, long, byte,
        //double variable values to float. Cast values if needed.

        thisMyShort = (short) thisIsMyFloat;
        System.out.println("thisMyShort = " + thisMyShort);

        thisMyInt = (int) thisIsMyFloat;
        System.out.println("thisMyInt = " + thisMyInt);

        thisLong = (long) thisIsMyFloat;
        System.out.println("thisLong = " + thisLong);

        thisThisMyFirstByte = (byte) thisIsMyFloat;
        System.out.println("thisThisMyFirstByte = " + thisThisMyFirstByte);

        thisIsMyDouble = thisIsMyFloat;
        System.out.println("thisIsMyDouble = " + thisIsMyDouble);



        //7. one by one, assign short, int, long, float,
        //byte variable values to double. Cast values if needed.

        thisMyShort = (short) thisIsMyDouble;
        System.out.println("thisMyShort = " + thisMyShort);

        thisMyInt = (int) thisIsMyDouble;
        System.out.println("thisMyInt = " + thisMyInt);

        thisLong = (long) thisIsMyDouble;
        System.out.println("thisLong = " + thisLong);

        thisIsMyFloat = (float) thisIsMyDouble;
        System.out.println("thisIsMyFloat = " + thisIsMyFloat);

        thisThisMyFirstByte = (byte) thisIsMyDouble;
        System.out.println("thisThisMyFirstByte = " + thisThisMyFirstByte);



        String s = "Java"+1+2+"Quiz"+""+(3+4);
        System.out.println(s);



















    }
}
