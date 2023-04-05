package just_For_Myself;

import java.util.HashMap;
import java.util.Map;

public class ConvertingDataTypes {
    public static void main(String[] args) {
        short num = 1;
        char char1 = 'A';

        char char2 = (char) num;
        System.out.println("char2 = " + char2);
        num = (short) char1;




        // ----------------

        char c = 'A';
        long l = c; // no cast is needed
        System.out.println("iumma : " + l + " this is l");

        long l1 = 12;
        // char c1 = l1;

        /*boolean b = true;
        char c1 = 'T';
        c1 = (char) b;*/  // boolean is not possible
        // --------------------
        /*
        1. char
        2. byte
        3. short
        4. int
        5. long
        6. double
        7. float                // The order from small to the biggest, when you convert from one to six
                                // you don't need casting, if vice versa, you need explicit conversion;
         */

        char c1 = 'T';
        byte byte1 = 123;

        byte1 = (byte) c1;

        //----------------------

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("j = " + j);
                System.out.println("\ti = " + i);
            }

        }

    }
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> newWordCount = new HashMap<>();
        for (int i = 0; i < strings.length; i ++){
            int count = 0;
            for (int j = 0; j < strings.length; j++) {
                System.out.println("j = " + j);
                System.out.println("i = " + i);
            }
        }
        return null;

    }

}
