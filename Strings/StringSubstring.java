package Strings;

public class StringSubstring {
    public static void main(String[] args) {

        String message = "Hello Chicago, why are you so cold and windy?";

        String city = message.substring(6,13); // Chicago
        System.out.println("city = " + city);

        String question = message.substring(15); // "why are you so cold and windy?
        System.out.println("question = " + question); // when we index in substring it starts count including the number we gave

                                                    // if we give int end, it does not count the last int
                                                                ///  beginning inclusive , end exclusive

        String welcomeSign = "Welcome to USA, our population is 140 million people, the average salary is 90k dollars"+
                " , and our president is Joe Biden";

        /*
        country = USA



         */

        String country = welcomeSign.substring(12,14);
        country = welcomeSign.substring(welcomeSign.indexOf("U"),welcomeSign.indexOf("A") + 1);
        System.out.println("country = " + country);

        String population = welcomeSign.substring(welcomeSign.indexOf("140"), welcomeSign.indexOf("ple") +3);
        System.out.println("population = " + population);

        String salary = welcomeSign.substring(welcomeSign.indexOf("90"),welcomeSign.indexOf("ars") +3);
        System.out.println("salary = " + salary);

        String president = welcomeSign.substring(welcomeSign.indexOf("Joe"));
        System.out.println("president = " + president);

        // /////////////////////////////////////////////////////////////

        String phrase = "Just one positive thought in the morning can change your whole day. ";

        String phrase1 = phrase.substring(0,4) + " a " + phrase.substring(18,25);
        System.out.println("phrase1 = " + phrase1);

        System.out.println(phrase.indexOf("positive"));
        System.out.println(phrase.indexOf("morning"));
        String phrase2 = phrase.substring(9,17) + " " + phrase.substring(33,40);
        System.out.println("phrase2 = " + phrase2);


       // System.out.println(phrase.indexOf("whole"));
        //System.out.println(phrase.indexOf("morning"));

        String phrase3 = phrase.substring(57,62) + " " + phrase.substring(33,40);
        System.out.println("phrase3 = " + phrase3);


        //System.out.println(phrase.indexOf("change") + " " +phrase.indexOf("one") + " " + phrase.indexOf("day"));

        String phrase4 = phrase.substring(45,51) + " " + phrase.substring(5,8) + " " + phrase.substring(63,66);
        System.out.println("phrase4 = " + phrase4);

        ///////////////////////////////////////////////////////////////////////////

        String str1 = "hi";
        String str2 = "bye";

        /*
        print: hibyebyehi
         */
        //System.out.println(str1+);

        //print: hi bye HI HI BYE BYE bye hi

        System.out.println(
                str1+ " " +str2+ " " + str1.toUpperCase() + " " + str1.toUpperCase() +
                        " " + str2.toUpperCase() + " " + str2.toUpperCase() + " "
                            + str2 + " "+ str1

        );

        //print ??? bi
        String b = str2.substring(0,1);
        String i = str1.substring(1);

        String bi = b + i;
        System.out.println("bi = " + bi);
        System.out.println(str1.charAt(1) + "" + str2.charAt(0));


        //jfkldsjflkdsjfksldfjsjlkfjds

        String see = "see";
        String hear = "hear";

        //print =====> sear
        System.out.println(see.substring(0,2) + "" + hear.substring(2,4));
        System.out.println("" +see.charAt(0) + see.charAt(1) + hear.charAt(2) + hear.charAt(3));


        //
        // Substring gives you back the string











    }
}
