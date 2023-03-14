package switchStatement;



import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter a number");
        int int1= myObj.nextInt();

        switch (int1){
            case 1,2,3,4,5:
                System.out.println("Week Day");
                break;
            case 6,7:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Wrong number!");
        }
    }



}
