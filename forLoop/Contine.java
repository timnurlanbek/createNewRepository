package forLoop;

import java.util.Scanner;

public class Contine {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i ++){
            System.out.println();
            if (i == 5){
                continue;

            }
            System.out.println(i);
        }

        for (int i = 1; i <= 100; i++ ){
            if (i % 2 == 0){
                continue;
            }
            else {
                System.out.println(i);
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a negative number:");
        int inputInt = sc.nextInt();

        System.out.println("Enter a positive:");
        int inputInt2 = sc.nextInt();

        int limit = 40;
        for (int i = inputInt; i <= inputInt2; i++){
            if (i < 0 && i % 2 == 0 ){
                continue;
            }
            else if(i > 0 && i % 2 != 0){
                continue;
            }
            else {
                System.out.println(i);
            }

        }
    }
}
