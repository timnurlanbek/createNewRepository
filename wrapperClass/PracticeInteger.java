package wrapperClass;

public class PracticeInteger {
    public static void main(String[] args) {

        String accountNumber = "1928347";

        int a = Integer.parseInt(accountNumber);
        Integer aa = Integer.max(2,50);
        System.out.println(a);
        System.out.println(aa);

        byte b = Byte.parseByte("120");
        System.out.println(b);

        boolean boo = Boolean.parseBoolean("TRUE");
        System.out.println(boo);


        char ch = Character.valueOf('5');
        System.out.println(ch);


        // ---------------------------------{

        // break after

        Integer num1 = Integer.valueOf(4);
        Integer num2 = Integer.valueOf("4");
        Integer num3 = Integer.valueOf('4');


        // go daddy

        int number = 4;
        long number2 = number; // implicit casting

        number = (int) number2; // explicit casting

        // --------------------

        String c = "323432";
        Integer c1 = Integer.valueOf(c);
        System.out.println(c);

        String doubleNumber = "49.99";
        Double doubleNumber1 = Double.parseDouble(doubleNumber);
        System.out.println(doubleNumber1);


        System.out.println(getIntFromString("123abcabc1324jfakld"));


        //wrapper boolean obj to String
        Boolean boolObj = Boolean.valueOf("true");
        String str = String.valueOf(boolObj);


        boolean primBool = boolObj;
        System.out.println(primBool);


        //-----------------------

        Double doublee = Double.valueOf("40.3");
        String doubleString = String.valueOf(doublee);

        //===========================

        double dd = doublee;


    }

    //apple123banana56  ==> 12356
    public static int getIntFromString (String number){
        // Character.isDigit()
        StringBuilder onlyDigits = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            if (Character.isDigit(number.charAt(i))){
                onlyDigits.append(number.charAt(i));
            }
        }
        if (onlyDigits.length() == 0){
            return -1;
        }

        return Integer.parseInt(onlyDigits.toString());
    }


}
