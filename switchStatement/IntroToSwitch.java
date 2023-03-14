package switchStatement;

public class IntroToSwitch {
    public static void main(String[] args) {
        /*int number = 0;

        switch (number){
            case 10: System.out.println("10");
                break;
            case 5:
                System.out.println("five");
                break;
            case 30:
                System.out.printf("thirty");
                break;
            case 50:
                System.out.printf("fifty");
                break;
            case 20:
                System.out.printf("twenty");
                break;
            default:
                System.out.printf("Not found!");*/




//-------------------------------------------------------


        String digit = "tim";

        switch (digit){
            case "one":
                System.out.println(1);
                break;
            case "two":
                System.out.println(2);
                break;
            case "three":
                System.out.println(3);
                break;
            case "four":
                System.out.println(4);
                break;
            case "five":
                System.out.println(5);
                break;
            case "six":
                System.out.println(6);
                break;
            case "seven":
                System.out.println(7);
                break;
            default:
                System.out.println("Not found!");
                break;
        }

        if (digit.equals("one")){
            System.out.println(1);
        }
        else if (digit.equals("two")){
            System.out.println(2);
        }
        else if (digit.equals("three")){
            System.out.println(3);
        }
        else if (digit.equals("four")){
            System.out.println(4);
        }
        else {
            System.out.println("Not found!");
        }



    }
}

