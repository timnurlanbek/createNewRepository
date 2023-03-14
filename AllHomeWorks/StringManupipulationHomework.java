package AllHomeWorks;

public class StringManupipulationHomework {
    public static void main(String[] args) {
        String message = "Hello everyone, Let's do Java String exercises";


        /*
        1. write a program that will create a following output:
        The character at position 10 is y
         */

        System.out.println(" The character at position 10 is " + message.charAt(10));



        //2. print out the length of the String message

        int lengthOfMessageIs = message.length();
        System.out.println("lengthOfMessageIs = " + lengthOfMessageIs);



        //3. print out the String message all in uppercase
        String strMessageInUppercaseIs = message.toUpperCase();
        System.out.println("StrMessageInUppercaseIs = " + strMessageInUppercaseIs);


        //4. print out the String message all in lowercase
        String strMessageLowercase = message.toLowerCase();
        System.out.println("strMessageLowercase = " + strMessageLowercase);

        //print only letter #5
        char letterNumFive = message.charAt(5);
        System.out.println("letterNumFive = " + letterNumFive + " ");

        //6. print only last letter
        char lastLetterOfMessage = message.charAt(message.length()-1);
        System.out.println("lastLetterOfMessage = " + lastLetterOfMessage);

        //7. print first letter in lowercase
        String firstletter = message.substring(0,1); // Let's pick up only first letter with the help substring
        
        String remLetStr = message.substring(1); // And choose the remaining letters
        
        firstletter = firstletter.toLowerCase();  // Let's make our first letter small
        
        String fullMessageWithLowercase = firstletter + remLetStr;  // And let's just add our first variable 
                                                                    // and to remaining letters;
        
        System.out.println("String with first loweredcase = " + fullMessageWithLowercase); // let's print
        
        
        
        

        //8. print last letter in uppercase






        String lastLetterOfMessage1 = message.substring(message.length()-1); //pick up last letter

        lastLetterOfMessage1 = lastLetterOfMessage1.toUpperCase(); // make it upper case

        String remLetOfMessage = message.substring(0,message.length()-1 ); // choose

        String lastCaseLoweredMessageD = remLetOfMessage + lastLetterOfMessage1;
        System.out.println("lastCaseLoweredMessageD = " + lastCaseLoweredMessageD);

        



    }

}
