package AllHomeWorks;

import java.util.Scanner;

public class CountDigit2T {
    public static void countDigitsInString(){
        Scanner sc = new Scanner(System.in);
        String inputString;
        int digitCount;

        do {
            System.out.println("Enter a word with three digits:");
            digitCount = 0;
            inputString = sc.nextLine();
            for (int i = 0; i < inputString.length(); i++ ){
                if (Character.isDigit(inputString.charAt(i))){
                    digitCount++;
                }
            }
            System.out.println("The number of digits in " + inputString + " is " + digitCount);

            if (3 == digitCount){
                System.out.println("You entered a word with three digits!");
                System.out.println("Program ended!");
                break;
            }


        }while(inputString.length() != 3);
    }

    public static void main(String[] args) {
        countDigitsInString();
    }
}
