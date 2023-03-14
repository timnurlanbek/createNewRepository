package AllHomeWorks;

public class StringManupulationHW {
    public static void main(String[] args) {

        /*
        * 1 ) Check if a given String contains a specific character:*/

        String str1 = "Hello, Universe!";

        char ch = 'o';

        Boolean isTrue_char_o = str1.contains("o");
        System.out.println("isTrue_char_O = " + isTrue_char_o);

        //-----------------------------------------------------

        /* 2) Extract a substring from a given String:*/

        String str2 = "Hello, World!";
        int start = 7;
        int end = 12;

        String substringFromStr2 = str2.substring(7,12);
        System.out.println("substringFromStr2 = " + substringFromStr2);

        //------------------------------------------------------------

        /* 3) Using charAt() method extract letter 'W'*/

        String str3 = "Good morning World";
        System.out.println(str3.indexOf("World"));
        char extractLet_W = str3.charAt(13);
        System.out.println("extractLet_W = " + extractLet_W);

        //===================================================================


        /* 4) Remove extra white spaces from both ends*/

        String str4 = "                I love coding             ";
        String useTrimForStr4 = str4.trim();
        System.out.println("useTrimForStr4 = " + useTrimForStr4);

        //-----------------------------------------------------------------------

        /* 5) Remove all occurrences of letter 'o' in the below String */

        String str5 = "Learn as if you will live forever, live like you will die tomorrow";

        String remove_o_InStr5 = str5.replace("o","");
        System.out.println("remove_o_InStr5 = " + remove_o_InStr5);

        //-----------------------------------------------------------------





    }
}
