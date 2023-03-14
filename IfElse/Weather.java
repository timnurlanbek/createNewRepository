package IfElse;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("What is the temp outside. Enter int:");
        double temp_outside = myObj.nextInt();

        System.out.println("is it raining? true / false");
        boolean isRaining = myObj.nextBoolean();




        if (temp_outside < 0){
            System.out.println("It is freezing outside. Wear a heavy coat, hat.");
        }
        else if (isRaining && temp_outside >= 0 && temp_outside <= 10){
            System.out.println("It's chilly and rainy! Wear a raincoat, boots, and a scarf.");
        }
        else if (isRaining && temp_outside >= 0 && temp_outside <= 10  ){
            System.out.println("It's chilly outside! Wear a jacket, gloves, and hat.");
        }
        else if (temp_outside > 11 && temp_outside < 20 && isRaining){
            System.out.println("It's cool and rainy! Wear a light jacket, boots, and a scarf.");

        }
        else if (temp_outside > 11 && temp_outside < 20 && isRaining){
            System.out.println("It is cool outside! Wear a light jacket and comfortable shoes.");

        }
        else if (temp_outside > 20 && isRaining){
            System.out.println("It's warm and rainy! Wear a light jacket, shorts, and sandals.");

        }
        else if (temp_outside > 20 && isRaining){
            System.out.println("It's warm outside! Wear a t-shirt, shorts, and comfortable shoes.");
        }
        else {
            System.out.println("I do not understand you!");
        }


    }
}
