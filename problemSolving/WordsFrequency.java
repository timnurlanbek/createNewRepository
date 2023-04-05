package problemSolving;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordsFrequency {
    public static void main(String[] args) {
        ArrayList <String> fruits = new ArrayList<>();
        fruits.add("Tim");
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("Tim");
        fruits.add("Kiwi");
        fruits.add("Kiwi");
        fruits.add("Kiwi");
        fruits.add("bear");
        fruits.add("bear");
        fruits.add("banana");
        fruits.add("banana");
        fruits.add("banana");
        fruits.add("pear");
        fruits.add("pear");
        fruits.add("pear");
        printWordsFrequency(fruits);
        System.out.println(LettersFrequency("mamamamama"));
    }


    public static void printWordsFrequency(ArrayList <String> list ){
        Map <String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))){
                    count++;
                }

            }
            map.put(list.get(i), count);

        }
        System.out.println(map);
    }

    public static HashMap <Character, Integer> LettersFrequency (String word){
        HashMap <Character,Integer> letterCount = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == word.charAt(i)){
                    count ++;
                }

            }
            letterCount.put(word.charAt(i), count);

        }
        return letterCount;
    }
}
