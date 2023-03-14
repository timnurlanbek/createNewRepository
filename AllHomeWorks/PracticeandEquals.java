package AllHomeWorks;

public class PracticeandEquals {
    public static void main(String[] args) {

        String hello1 = "Hello World!";
        String hello2 = "Hello World!";
        String hello3 = new String("HelloWorld!");

        //1. write a program that compares values of hello1 and hello2, and results in true
        boolean isEqual1n2 = hello1 == hello2;
        System.out.println("isEqual1n2 = " + isEqual1n2);



        //2. write a program that compares values of hello1 and hello3, and results in false
        boolean isEqual1n3 = hello1 == hello3;
        System.out.println("isEqual1n3 = " + isEqual1n3);

        //3. write a program that compares values of hello1 and hello2, and results in false
        boolean isNotEqual1n2 = hello1 != hello2;
        System.out.println("isNotEqual1n2 = " + isNotEqual1n2);

       // 4. convert hello1 and hello2 to all lower case and compare them

        String hello1Lowercase = hello1.toLowerCase();
        String hello2Lowercase = hello2.toLowerCase();

        System.out.println("hello1Lowercase = " + hello1Lowercase);
        System.out.println("hello2Lowercase = " + hello2Lowercase);

        boolean isEqualLowercase = hello1Lowercase == hello2Lowercase;
        System.out.println("isEqualLowercase = " + isEqualLowercase); // False

        System.out.println("Is equal lowercases: " + hello1Lowercase.equals(hello2Lowercase)); //True
        // Well, this is because I created new different objects in my heap memory, hello1lowercase and
        // hello2lowercase have their own objects, even if the letters are the same.


        //5. convert hello1 and hello3 to upper case and compare them
        String upperCaseHello1 = hello1.toUpperCase();
        String upperCaseHello2 = hello2.toUpperCase();

        boolean isEqualUpCase1n2 = upperCaseHello1 == upperCaseHello2;
        System.out.println("isEqualUpCase1n2 = " + isEqualUpCase1n2);


        String s = "quizl";
        System.out.println(s.charAt(s.length()-1));





    }
}
