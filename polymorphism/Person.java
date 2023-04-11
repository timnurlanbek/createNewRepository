package polymorphism;

public class Person {
    String instanceVariable = "1";

    static String staticVariable = "2";


    public void instanceMethod(){

        staticVariable = "some";
    }

    public static void main(String[] args) {
        System.out.println(staticVariable);

        System.out.println(frontBack("code"));




    }

    public static String frontBack(String str) {
        String newString = "";
        char firstLetter = str.charAt(0);
        char lastLetter = str.charAt(str.length()-1);


        for (int i = 0; i < str.length() - 1; i++){
            newString = String.valueOf(str.charAt(i));
        }
        System.out.println(newString + " str ");
        return lastLetter + newString + firstLetter;
    }



}
