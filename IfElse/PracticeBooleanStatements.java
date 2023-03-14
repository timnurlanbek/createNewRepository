package IfElse;

public class PracticeBooleanStatements {
    public static void main(String[] args) {




        boolean b1 = 100 > 1; //true

        String str1 = "avacado";

        boolean b2 = str1.startsWith("d"); // false
        System.out.println("b2 = " + b2);

        boolean b3 = 4<= 5;
        // true
        System.out.println("b3 = " + b3);


        boolean b4 = 23 == 100; // false

        System.out.println("b4 = " + b4);
        boolean b5 = 78 != 23; //true
        System.out.println("b5 = " + b5);

        String str2 = "Apple";
        boolean b6 = str2.equals(str1); // false
        System.out.println("b6 = " + b6);

        boolean b7 = str2.equals(b1); // false
        System.out.println("b7 = " + b7);

        boolean b8 = str2.isEmpty(); //false
        System.out.println("b8 = " + b8);

        boolean b9 = str2.contains("A"); // true
        System.out.println("b9 = " + b9);


    }
}
