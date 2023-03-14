package Strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String banner = "ThanksGiving Sale 20%";

        boolean isSale = banner.startsWith("Thanks"); //true
        System.out.println("isSale starts with = " + isSale);

        System.out.println(banner.startsWith("thanks")); //false
        System.out.println(banner.startsWith("T")); // true
        System.out.println(banner.startsWith("t")); //false


        boolean endWith = banner.endsWith("%");
        System.out.println("endWith = " + endWith); // true


        System.out.println( banner.endsWith("Sale 20% ")); //false
        System.out.println(banner.endsWith("sale 20%")); //false

        //






    }
}
