package forEach;

import java.util.Random;
import java.util.Scanner;

public class GuessTheWord {
    /*
    Give option to select a topic
     */

    String [] topics = {"animals", "cities", "vegetables"};

    String [] animals = {"Cow","Donkey","dog","cat"}; // give values

    String [] cities = {"osh","bishkek", "chicago"}; // give values

    String [] vegetables = {"banana","onion", "carrot"}; // give values



    int easyLevel = 6;
    int mediumLevel = 3;
    int difficultLevel = 1;

    public static String getWordFromGivenTopic(String topic){

        Random rand = new Random();

        //int randomTopic =
        /*
        if topic = animals,
        if topic = veggies,
        if topic = cities,
         */
        return "";
    }










    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the game. Please choose the level: ");
        System.out.println("1) Easy___________2) Medium ______________ 3) Difficult");
        String level = sc.next().toLowerCase();

        // //Use random number generator to select a word from
        // the array based on the topic selected (method)




        /*
        check level
        ask user to select topic
        isWordGuessed = false;
        create while loop
         */
    }
}
