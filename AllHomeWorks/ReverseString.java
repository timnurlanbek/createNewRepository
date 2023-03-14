package AllHomeWorks;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);
        System.out.println("Enter a string:");
        String str1 = sc.nextLine();
        System.out.println("Reversed word: ");
        for (int i = str1.length()-1; i >= 0; i--){
            System.out.print(str1.charAt(i));
        }
        /*
        * 1. lift your car
        * 2. take bolts off
        *
        *
        * 3. put under the car a thing, so the cat would not move
        * 4. take the tire off
        * 5. put another tire
        * 6. put the bolts */

    }
}
