package array;

import java.util.Random;
import java.util.Scanner;

public class jumbleGame {



    /*
    * 1. String creating
    * 2. create for loop take input from the user from zero to four
    * 3. method shuffle */






    public static void main(String[] args) {

        /*String [] cars = {"Lexus", "Mazda", "Toyota","Mercedes","Subaru"};


        Random random = new Random();
        int randomNumber = random.nextInt(5);

        for (int i = 1; i <= 5; i++){
            String selectCar = cars [randomNumber];
        }

        String selectCar = cars [randomNumber];
        System.out.println(selectCar);*/




        String [] cars = {"Lexus", "Mazda", "Toyota","Mercedes","Subaru"};


        Random random = new Random();
        int randomNumber = random.nextInt(5);


        Scanner sc = new Scanner(System.in);


        for (int i = 1; i <= 5; i++){
            String selectCar = cars [randomNumber];
        }

        String selectCar = cars [randomNumber];
        System.out.println(selectCar);


        int score = 0;
        int a = 0;

        for (int i = 0; i < selectCar.length(); i ++){
            char c = (selectCar.charAt(random.nextInt(selectCar.length())));
            System.out.print(c);
        }

        if (a == 0){

            String inputUser = sc.nextLine();

            if (inputUser.equalsIgnoreCase(cars[0])){
                System.out.println("You have guessed correctly!");
                score += 1;
            }
            else {
                System.out.println("Not correct!");
            }

        }




    }


    public static String carJumble (int a){
        String [] cars = {"Lexus", "Mazda", "Toyota","Mercedes","Subaru"};


        Random random = new Random();
        int randomNumber = random.nextInt(5);
        Scanner sc = new Scanner(System.in);
        String inputUser = sc.nextLine();
        for (int i = 1; i <= 5; i++){
            String selectCar = cars [randomNumber];
        }

        String selectCar = cars [randomNumber];
        System.out.println(selectCar);


        int score = 0;
        a = 0;
        if (a == 0){
            System.out.println("uesxl");
            if (inputUser.equalsIgnoreCase(cars[0])){
                System.out.println("You have guessed correctly!");
                score += 1;
            }
            else {
                System.out.println("Not correct!");
            }

        }

        return "";
    }
}
