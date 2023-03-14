package forLoop;

import java.util.Scanner;

public class BreakPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int inputInt = sc.nextInt();

        System.out.printf("Enter second number:");
        int inputInt2 = sc.nextInt();

        int limit = 40;
        int sum = inputInt2 + inputInt;

        for (int i = 1; i <= sum; i++){
            if (i >= 45){
                break;
            }
        }
        System.out.println("After loopf");
    }
}
