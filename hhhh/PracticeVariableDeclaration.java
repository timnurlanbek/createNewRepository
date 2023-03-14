package hhhh;

public class PracticeVariableDeclaration {

    public static void main (String [] args) {

        /*
        this is just a comment
        public static void main tushunbodum
        1. Declare variable (means create a variable, but do not give a value yet)
        this is called multi line comment
        2. Assign value to variable ( put value inside variable)
        3. Reassign value to variable ( put new value to the same variable

       ----------------------------------------------------------------------

       VARIABLE DECLARATION

       byte myByte;
       short myShort;
       int myInt;
       long myLong;

       NAMING CONVENTION:
       all variable must start with lower case
       all variables must use camelCase

       ex:
       thisIsMyCamelCaseWord
       thisIsCleanCoding
      ---------------
      All classes must start with uupper case, use camelCase
      all packages must start wiht lower case, use camelCase
      -names must start with any letter, or _ $ sign
      - but can not start with number your variables.
      _my_Name_Is_Temirbek

      --------------------------------------------------

      VALUE ASSIGNMENT
      byte myByte = 3; ( declare variable and assign value

      short age; (declaring variable)
      age = 40; (assigning value to variable)

      -----------------------------------------------

      REASSIGN VALUE

      int number = 100;
      number = 30; (reassign value)
      number = 0;



         */
        // this is single line comment

        byte myByte; //declared variable
        byte _another_byte;

        myByte = 5;
        System.out.println(myByte); //10

        myByte = 20;
        System.out.println(myByte); // 20;
        // System.out.println(myByte) >> practice this one more printng

        /*
        create 5 short variables
        assign values, reassign values twice
        print them'
        -------------------------------------------------------------------------

         */
        short first_Variable;
        first_Variable = 1;
        System.out.println(first_Variable);

        first_Variable = 2;
        System.out.println(first_Variable);



        short second_Variable;
        second_Variable= 11111;
        System.out.println(second_Variable);

        short five_Digit_Password;
        five_Digit_Password = 12345;
        System.out.println(five_Digit_Password);

        int koopSandar = 1234;
        System.out.println(koopSandar);



    }
}
