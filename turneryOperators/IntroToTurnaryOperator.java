package turneryOperators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class IntroToTurnaryOperator {
    // int x = 100 + 250;
    //  operand operator operand

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();*/
        int num = 18;
        String evenOrOdd = num % 2 == 0 ? "even" : "odd";
        System.out.println(evenOrOdd);


        // -------------------------------

        int num1 = 8;
        int num2 = 100;

        int highest = num1 > num2 ? num1 : num2;
        System.out.println("highest = " + highest);

        int lowest = Math.min(num1,num2);
        System.out.println("lowest = " + lowest);

        // -------------------------------

        String word = "hello";

        String yesOrNo = word.contains("a") ? "yes" : "no";
        System.out.println(yesOrNo);

        // -----------------------------------

        boolean b = 10.9 < 11 & 11 > 0 ? true : false;
        //          boolean          then print : else


        //====================================
        int int2 = -23;
        System.out.println(checkIfNumberIsPositive(int2) ? "positive" : "negative");

        String result = checkIfNumberIsPositive(int2)
                ? returnPositive()
                : returnNegative();
        System.out.println("result = " + result);

        // --------------------------------------------

        double d1 = 12.12;
        double d2 = 23.23;
        double lowestDouble = d1 < d2 ? d1 : d2;
        double lowestDouble2 = Math.min(d1,d2);
        System.out.println("lowestDouble2 = " + lowestDouble2);
        System.out.println("lowestDouble = " + lowestDouble);

        // -------------------------------------------

        String str1 = "Temirbek";
        String str2 = "Nurlanbek";
        String longestString = str1.length() > str2.length() ? str1 : str2;
        String longestString2 = str1.length() > str2.length()
                ? str1
                : str2;
        System.out.println("longestString2 = " + longestString2);
        System.out.println("longestString = " + longestString);
        // ---------------------------------------------------------------------
        String vowels = "a,e,i,o,u,y";
        String doesContainVowel = str1.contains("a") | str1.contains("e") | str1.contains("i") |
                str1.contains("o") | str1.contains("u") | str1.contains("y")
                ? "Vowel"
                : "No Vowel";
        System.out.println("doesContainVowel = " + doesContainVowel);

        // ---------------------------------------

        ArrayList <String> names = new ArrayList<>();
        names.add("Tim");
        names.add("John");
        names.add("Bekzod Aka");
        names.add("Bekzod Aka");

        String isMoreThanThreeElements = names.size() > 3
                ? "Enough"
                : "Not enough";
        System.out.println("isMoreThanThreeElements = " + isMoreThanThreeElements);

        // -----------------------------------------------

        HashMap <String, String> fruits = new HashMap<>();
        fruits.put("veggie", "banana");
        fruits.put("fruit", "apple");

        String fruit = fruits.containsValue("banana")
                ? fruits.put("fruit", "banana")
                : null;

        System.out.println("fruits = " + fruits);

        // -------------------------------------------------


        boolean containsStone = fruits.containsKey("stone")
                ? true
                : false;

        System.out.println("containsStone = " + containsStone);


        // -----------------------------------------------------------

        /*int [] arrayList = {1,23,23,23,543};
        int find_average = average() > 10
                ? "wohoo"
                : "nooo";*/



        // -------------------------------------------
        byte b1 = 2;
        byte b2 = 3;
        byte b3 = 100;
        
        String isOver = getHighest(b1,b2,b3) > 10
                ? "over"
                : "less";
        System.out.println("isOver = " + isOver);

    }

    public static boolean checkIfNumberIsPositive(int num){
        return num > 0;
    }


    public static String returnPositive (){
        return "positive";
    }

    public static String returnNegative (){
        return "negative";
    }





    public static double average (ArrayList<Integer> list) {
        double sum = 0;
        int count = 0;
        for (double d :
                list) {
            sum = sum + d;
            count ++;
        }
        return sum / count;
    }
    
    
    public static int getHighest (byte b1, byte b2, byte b3){
        if (b1 > b2 && b1 > b3){
            return b1;
        }
        else if (b2 > b3 & b2 > b1){
            return b2;
        }
        else {
            return b3;
        }
    }
}
