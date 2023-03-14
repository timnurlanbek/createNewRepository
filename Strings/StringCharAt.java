package Strings;

public class StringCharAt {
    public static void main(String[] args) {

        String welcomeSign = "Hello everyone! Welcome to Chicago";
        char c = welcomeSign.charAt(14);
        System.out.println("c = " + c);

        char cc = welcomeSign.charAt(2);
        System.out.println("cc = " + cc);

        char ccc = welcomeSign.charAt(0);
        System.out.println("ccc = " + ccc);


        System.out.println(welcomeSign.length());
        char c2 = welcomeSign.charAt(33);
        System.out.println("c2 = " + c2);

        //999999999999999999999999999999999999999999999999

        System.out.println(welcomeSign.charAt(welcomeSign.length()-1));

        // indexOf gives you the number position if you give an alphabet
        // char at gives you the alphabet if you give a number



    }
}
