package scannerClass;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Please enter any month you want:");
        String monthInput = myObj.nextLine();

        if (monthInput.equals("September") | monthInput.equals("October") | monthInput.equals("November")){
            System.out.println("This is Autumn !");
        }
        else if (monthInput.equals("December") | monthInput.equals("January") | monthInput.equals("February")){
            System.out.println("This is Winter !");
        }
        else if (monthInput.equals("March") | monthInput.equals("April") | monthInput.equals("May")){
            System.out.println("This is Spring !");
        }
        else if (monthInput.equals("June") | monthInput.equals("July") | monthInput.equals("August")){
            System.out.println("This is Summer !");
        }
        else {
            System.out.println(" Please enter only month names with capital letter !");


        // ==============================================================================
            System.out.println("What speed were you going at? Enter only your speed:");
            int speed = myObj.nextInt();


            System.out.println("Is it your birthday today? Yes or No");
            boolean birthdayYesNo = myObj.nextBoolean();
            System.out.println("birthdayYesNo = " + birthdayYesNo);

            if (speed <= 60 && birthdayYesNo){
                System.out.println("No ticket");
            }
            else if (speed > 60){
                System.out.println("Small Ticket");
            }
            else if (speed > 80){
                System.out.println("Medium ticket");
            }
            else if (speed > 100){
                System.out.println("Large Ticket");
            }
            else {
                System.out.println("");
            }
        }
    }
}
