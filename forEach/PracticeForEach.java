package forEach;

import java.util.Scanner;

public class PracticeForEach {

    public static void main(String[] args) {
        System.out.println(sameCharRepetition("TemirTtbekt", 't'));
        Scanner sc = new Scanner(System.in);
        boolean talking = sc.nextBoolean();
        System.out.println("enter: ");
        if (talking){
            talking = false;
            System.out.println(talking);
        }
    }

    public static String sameCharRepetition (String word, char letter){
        int count = 0;
        word = word.toLowerCase();
        letter = Character.toLowerCase(letter);
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter){
                count++;
            }

        }
        
        return "The same occurrence of Chars : " + count;
    }

    public boolean parrotTrouble(boolean talking, int hour) {

        return (talking && (hour < 7 | hour > 20)) ;
    }
}
