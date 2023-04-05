package arrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListProblems {
    public static int returnSumOfEvens (ArrayList <Integer> numbers ){
        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                sum += numbers.get(i);

            }

        }
        return sum;
    }

    public static int returnSumOfOdds (ArrayList <Integer> numbers){
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0){
                sum += numbers.get(i);
            }
        }
        return sum;
    }
    
    
    public static boolean doesWordExist (ArrayList <String> list, String word){
        return list.contains(word);
    }
    
    
    public static ArrayList<String> reversedList (ArrayList <String> list){
        for (int i = 0; i < list.size(); i++) {
            list.set(i, reversedStr(list.get(i)));
            
        }
        return list;
    }
    
    
    public static String reversedStr (String str){
        String reversed = "";
        for (int i = str.length()-1; i <= 0 ; i--) {
            reversed += str.charAt(i);
            
        }
        return reversed;
    }


    public static double getAverageOfDoubles (ArrayList <Double> list){
        int a = 0;
        double sum = 0;
        while (a < list.size()){
            sum += list.get(a);
            a++;


        }
        return  sum / list.size();

    }



    public static int getHighestNumber (ArrayList<Integer> numbers){
        int highestNumber = Integer.MIN_VALUE;

        for (int i = 0; i < highestNumber; i++) {
            ;

        }
        return highestNumber;
    }








    
    
    













    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }

        System.out.println(returnSumOfEvens(numbers));




        ArrayList <String> list = new ArrayList<>();
        list.add("Quran");
        list.add("Takyba");
        list.add("Namaz");



        // 00000000000000000000000000000000000000000000000000000000000


        List <String> shoppingList = new ArrayList <>();
        shoppingList.add("apple");
        shoppingList.add("banana");
        shoppingList.add("watermelon");


        int numberOfItems = 0;
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(i + 1 +") " +   shoppingList.get(i));
            numberOfItems += i;


        }
        System.out.println("Number of items is " + numberOfItems);



        shoppingList.clear();
        shoppingList.size();
        System.out.println(shoppingList);

        String [] newArray = {"potato", "soap", "bodywash", "banana"};

        List <String> arrayOfNewArray = Arrays.asList(newArray);
        shoppingList = Arrays.asList(newArray);
        System.out.println(arrayOfNewArray);


        int a = 0;
        while (a < arrayOfNewArray.size()){
            System.out.println(a + 1 + ") " + arrayOfNewArray);
            a++;
        }






        // =-========================================================-======================

        ArrayList <Double> doubleAverage = new ArrayList<>();

        doubleAverage.add(4.5);
        doubleAverage.add(10.5);
        doubleAverage.add(29.5);
        doubleAverage.add(39.5);
        System.out.println(getAverageOfDoubles(doubleAverage));







    }

    
    
    
}
