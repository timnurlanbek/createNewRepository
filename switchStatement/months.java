package switchStatement;

import java.util.Scanner;

public class months {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 12");

        int month = sc.nextInt();

        if (month == 1) {
            System.out.println("January");
        } else if (month == 2) {
            System.out.printf("February");
        } else if (month == 3) {
            System.out.printf("March");
        }
        else if (month == 4) {
            System.out.printf("April");
        }
        else if (month == 5) {
            System.out.printf("May");
        }
        else if (month == 6) {
                        System.out.printf("June");
        }
        else if (month == 7) {
            System.out.printf("July\n");
        }else if (month == 8) {
            System.out.printf("August\n");
        }else if (month == 9) {
            System.out.printf("September\n");
        }else if (month == 10) {
            System.out.printf("October\n");
        }
        else if (month == 11) {
            System.out.printf("November\n");
        }
        else if (month == 12) {
            System.out.printf("December\n");
        }
        else {
            System.out.println("Not found!");
        }


        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
                }

        switch (month){
            case 6,7,8:
                System.out.println("It's Summer! ");
                break;
            case 9,10,11:
                System.out.println("It's Autumn");
                break;
            case 12,1,2:
                System.out.println("It's Winter!");
                break;
            case 3,4,5:
                System.out.println("It's Spring");
        }

        if (month == 6 || month == 7 || month == 8){
            System.out.println("It's Summer!");
        }
        else if (month == 9 || month == 10 || month == 11) {
            System.out.println("It's Autumn!");
        }
        else if (month == 12 || month == 1 || month == 2) {
            System.out.println("It's Winter!");
        }
        else if (month == 3 || month == 4 || month == 5) {
            System.out.println("It's Spring!");
        }
        else {
            System.out.println("Wrong Number!");
        }




    }
}



