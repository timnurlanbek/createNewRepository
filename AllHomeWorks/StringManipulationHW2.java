package AllHomeWorks;

public class StringManipulationHW2 {
    public static void main(String[] args) {
        // # 1 Check if a given String ends with a specific substring.
        String greeting = "Welcome to my channel";
        System.out.println(greeting.endsWith("channel"));

        // ================================================

        // # 2 Extract a substring from a given String starting from a specific index.

        String extractString = greeting.substring(0,7);
        System.out.println("extractString = " + extractString);

        // ================================================ #3

        String replace_greeting = greeting.replace("channel","house");
        System.out.println("replace_greeting = " + replace_greeting);

        //--------------------------------------------------- # 4

        String retrieve_substring = greeting.substring(0,7);
        System.out.println("retrieve_substring = " + retrieve_substring);

        //---------------------------------------------

        /* #5
        * Find the index of the last character in a given String */

        char last_char = greeting.charAt(greeting.length()-1);
        System.out.println("last_char = " + last_char);

        //------------------------------------------------------
        /* #6
          Check if a given String starts with a specific substring*/

        boolean is_Starts_with = greeting.startsWith("Welcome");
        System.out.println("is_Starts_with = " + is_Starts_with);

        //---------------------------------------------------

        /* #7
        Replace the first occurrence of a specific character in a given String*/

        String replace_a_char = greeting.replace("W","H");
        System.out.println("replace_a_char = " + replace_a_char);

        //000000000000000000000000000000000000000000000000000000000000000

        /* 8)
        Retrieve the index of the nth occurrence of a specific character in a given String.*/

        int index_n = greeting.indexOf("n");
        System.out.println("index_n = " + index_n);

        // ----------------------------------------------------

        /* #9 Remove all whitespace characters from a given String*/
        String remove_whitespace = greeting.replace(" ","");
        System.out.println("remove_whitespace = " + remove_whitespace);

        // ------------------------------------------------------

        /*#10
        * Convert all the characters in a given String to uppercase.*/

        String upperCaseChar = greeting.toUpperCase();
        System.out.println("upperCaseChar = " + upperCaseChar);




    }
}
