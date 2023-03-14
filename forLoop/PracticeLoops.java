package forLoop;

public class PracticeLoops {
    public static void main(String[] args) {

        for (int int1 = 1; int1 <= 15; int1+=2 ){
            System.out.println("The value of num is: " + int1);
        }

        int sum = 0;
        for (int int2 = 1; int2 <=10; int2+=1){
            System.out.println("The value of int2 is: " + int2);

            sum = sum + int2;

        }
        System.out.println("\nThe sum of int2 is: " + sum);


        for (int int2 = 0; int2 <=100; int2+=2){
            System.out.println("The value of int2 is: " + int2);

            sum = sum + int2;


        }
        System.out.println("The sum of int2 is: " + sum);


        for (int int2 = 1; int2 <=100; int2+=1){
            if (int2 % 2 == 0 ){
                System.out.println("The value of int2 is " + int2);

            }

            sum = sum + int2;

        }
        System.out.println("The sum of int2 is: " + sum);
    }

}
