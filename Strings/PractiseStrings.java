package Strings;

import java.sql.SQLOutput;

public class PractiseStrings {
    public static void main(String[] args) {

        String singerName = "Micheal Jackson";

        System.out.println(singerName.length()); // returns number of chars

        System.out.println(singerName.endsWith("ON")); // false
        System.out.println(singerName.startsWith("Misha")); // false
        System.out.println(singerName.startsWith("micheal")); // false

        System.out.println(singerName.isEmpty()); //false
        System.out.println(!singerName.isEmpty()); // true

        System.out.println(singerName.toLowerCase()); // micheal jackson
        System.out.println(singerName); // Micheal Jackson

        singerName = singerName.toUpperCase(); // upper cases
        System.out.println("singerName = " + singerName);


        System.out.println(singerName.charAt(0)); //M
        System.out.println("" +singerName.charAt(0) + singerName.charAt(3)); // Mh
        System.out.println("ASCII table " + singerName.charAt(0) + singerName.charAt(3)); //

        System.out.println(singerName.indexOf("J"));
        System.out.println(singerName.indexOf("C"));
        System.out.println("2 is "+singerName.indexOf("C", 3)); //10
        System.out.println(singerName.indexOf("W")); //-1 IF WE don't have a character in out string, it gives us -1
                                                        // too many chars, gives index out of bounds error


        String singerName2 = "Justin Bieber";

        boolean areTheySame = singerName.equals(singerName2); // False
        System.out.println("areTheySame = " + areTheySame);

        System.out.println(!singerName.equals(singerName2)); // True

        singerName = singerName2;

        System.out.println(singerName2.equals(singerName)); // true, cuz we made it equal to e.other
        System.out.println(singerName2==singerName); // True, cuz in heap memory we have one justin, and both variables are
        //pointing to the same object that's why it is true


















    }
}
