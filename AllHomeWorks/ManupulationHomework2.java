package AllHomeWorks;

public class ManupulationHomework2 {
    public static void main(String[] args) {
 /*
        Write a program that prints out the index of the first occurrence
        of the word "world" in the string "Hello world" using the indexOf method.
*/

        String strHelloWorld = "Hello world";
        Integer first_letter_world = strHelloWorld.indexOf("w");
        System.out.println("first_letter_world = " + first_letter_world);




        // 2) Write a program that prints the first letter of the string "Hello" using the charAt method.

        char firstLetHello = strHelloWorld.charAt(0);
        System.out.println("firstLetHello = " + firstLetHello);




        // 3)Write a program that prints the string "HELLO"
        // in all lowercase using the toLowerCase method.

        String wordHello = strHelloWorld.substring(0,6);// pick up "Hello"
        System.out.println("wordHello = " + wordHello);
        String wordHelloUpcase = wordHello.toUpperCase(); // make it uppercase
        System.out.println("wordHelloUpcase = " + wordHelloUpcase);

        String wordHelloLowcase = wordHelloUpcase.toLowerCase(); // make it lowercase
        System.out.println("wordHelloLowcase = " + wordHelloLowcase);

        //Write a program that checks if the strings "hello" and "Hello"
        // are equal or not using the equals method.

        boolean isEqualHellonhello = wordHelloLowcase.equals(wordHello);
        System.out.println("isEqualHellonhello = " + isEqualHellonhello);




        //Write a program that prints a new string with the first letter of each word
        // in the string "the quick brown fox" capitalized using the substring, toUpperCase,
        // and toLowerCase methods.

        String wordTheQuickBrownFox = "the quick brown fox";
        System.out.println("Below I am going to make capitalize each word of " + wordTheQuickBrownFox);



        
        
        //---------------------------------------------------------
        String wordThe = wordTheQuickBrownFox.substring(0,3); // pick up the word "the" separately
        System.out.println("wordThe = " + wordThe);

        wordThe = wordThe.substring(0,1).toUpperCase() + wordThe.substring(1); // capitalize it
        // 1) t 2)T = tThe >>  t|The
        System.out.println("wordThe = " + wordThe);
        // Word The is ready for us


        // Now the word quick
        int word_quick_index = wordTheQuickBrownFox.indexOf("quick"); // using indexOf figure out what number the word " quick " is
        System.out.println(word_quick_index + " the index of quick");

        String word_quick = wordTheQuickBrownFox.substring(4,9); // separate from the sentence
        System.out.println("word_quick = " + word_quick);

        String wordQuick = word_quick.substring(0,1).toUpperCase() + word_quick.substring(1); // capitalize it
        System.out.println("word_Quick = " + wordQuick);
        
        

        int word_brown_index = wordTheQuickBrownFox.indexOf("brown"); // see where "brown" was indicated
        System.out.println("word_brown_index = " + word_brown_index);

        String word_brown = wordTheQuickBrownFox.substring(10,15); // separate from the sentence
        System.out.println("word_brown = " + word_brown);

        String wordBrown = word_brown.substring(0,1).toUpperCase() + word_brown.substring(1); // capitalize it
        System.out.println("wordBrown = " + wordBrown);
        




        int word_fox_index = wordTheQuickBrownFox.indexOf("fox"); // see IndexOf fox
        System.out.println(word_fox_index + " index of fox");

       String word_fox = wordTheQuickBrownFox.substring(16,19); // separate it
        System.out.println("word_fox = " + word_fox);

        String wordFox = word_fox.substring(0,1).toUpperCase() + word_fox.substring(1); // capitalize it
        System.out.println("wordFox = " + wordFox);



        //Output


        String theQuickBrownFox = wordThe + " " + wordQuick + " " + wordBrown + " " + wordFox; // put all of them together
        System.out.println("theQuickBrownFox = " + theQuickBrownFox);

        //-------------------------------------------------------------------------

        String hello = "Hello";

        //Write a program that prints
        // the string "Hello" in reverse order using the charAt method.

        char H = hello.charAt(0);
        char e = hello.charAt(1);
        char l = hello.charAt(2);
        char o = hello.charAt(4);
        System.out.println("" + o + l + l + e + H);


        //--------------------------------------------------------
        //#8 Write a program that counts the number of vowels in the
        // string "Hello World" using the charAt and toLowerCase methods.

        String strHelloWorld1 = "Hello World";

        char firstVowel = strHelloWorld1.charAt(1);
        char secondVowel = strHelloWorld1.charAt(4);
        char thirdVowel = strHelloWorld1.charAt(7);
        // I swear I don't know to count using charAt

        // ---------------------------------------------------------
        //#9 Write a program that concatenates the strings "Hello" and
        // "World" using the concat method and prints the resulting string.

        String hello2 = "Hello";
        String World2 = "World";

        String helloWorld = hello2.concat(" " + World2);
        System.out.println("helloWorld = " + helloWorld);

        // ---------------------------------------

        // #10 Write a program that checks if the strings "hello"
        //and "HELLO" are equal ignoring case using the equalsIgnoreCase method

        hello = "hello";
        String HELLO = "HELLO";

        System.out.println("Equals ignore case "
                + hello + " and " + HELLO + ": "+ hello.equalsIgnoreCase(HELLO));

        //-----------------------------------------------------------



        // # 11 Write a program that prints the length of
        // the string "Hello World" using the length method

       int helloWorldlength = helloWorld.length();
        System.out.println("helloWorldlength = " + helloWorldlength);

        // # 12 Write a program that prints the third character of
        // the string "Hello" using the charAt method.

       char thirdCharHello = hello.charAt(2);
        System.out.println("thirdCharHello = " + thirdCharHello);



        /* # 13
         Write a program that prints out the index of the
         first occurrence of the letter "l" in the string "Hello World"
          using the indexOf method.*/

       int helloWorldIndexL = helloWorld.indexOf("l");
        System.out.println("helloWorldIndexL = " + helloWorldIndexL);

        /*
        * # 14
        * Write a program that checks if the string "hello"
        *and "hello" are equal using both the == and equals methods.*/

        String hello1 = "hello";
        String hello3 = "hello";
        boolean IsEqual_hello1_hello3 = hello1 == hello3;
        System.out.println("IsEqual_hello1_hello3 = " + IsEqual_hello1_hello3); // true, cuz they point to the same object


        /*  #15
        Write a program that checks if the string "hello" and "HELLO" are equal using both the == and equals methods.

         */
        boolean IsEqual_HELLO_and_hello = HELLO == hello;
        System.out.println("IsEqual_HELLO_and_hello = " + IsEqual_HELLO_and_hello); //false, cuz they point to different objs


        /* #16 Write a program that prints the string
        "HELLO WORLD" in all lowercase using the toLowerCase method.*/

        String helloWorldUpCase = "HELLO WORLD";
        String helloWorldLowCase = helloWorldUpCase.toLowerCase();
        System.out.println("HelloWorldLowCase = " + helloWorldLowCase);

        /*
        * #17
         * Write a program that prints the string
         * "hello world" in all uppercase using the toUpperCase method.*/

        String HelloWorldUpCase2 = helloWorldLowCase.toUpperCase();
        System.out.println("HelloWorldUpCase2 = " + HelloWorldUpCase2);

        /*#18 Write a program that replaces all occurrences of the letter "l" with the
        letter "r" in the string "Hello World" using the replace method*/

        String helloWorld_LtoR = helloWorld.replace("l","r");
        System.out.println("helloWorld_LtoR = " + helloWorld_LtoR);

        /* #19
        * Write a program that prints a new string with the first
        * letter of each word in the string "the quick brown fox" capitalized using
        * the substring, toUpperCase, and toLowerCase methods.

         */

        String assignment19 = "" +
                "Write a program that prints a new string with the first letter of each word in the string " +
                "\"the quick brown fox\" capitalized using the substring, toUpperCase, and toLowerCase methods.\n" +
                "\n";

        String assignment6 = "" +
                "Write a program that prints a new string with the first letter of each word in the string \"" +
                "the quick brown fox\" capitalized using the substring, toUpperCase, and toLowerCase methods.\n" +
                "\n";

        boolean isNotItTheSame_6_and_19 = assignment6.equals(assignment19);
        System.out.println("isNotItTheSame_6_and_19 = " + isNotItTheSame_6_and_19);









        




























    }
}
