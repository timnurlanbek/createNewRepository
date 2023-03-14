package AllHomeWorks;

import java.util.Scanner;

public class SwitchHomeWork {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter only symbols:");

        String inputSymbol = myObj.nextLine();

        switch (inputSymbol){
            case "!":
                System.out.println("Exclamation mark");
                break;
            case "?":
                System.out.println("Question mark");
                break;
            case "%":
                System.out.println("Modulus");
                break;
            case "#":
                System.out.println("Hash");
                break;
            case "*":
                System.out.println("star");
                break;
            case "@":
                System.out.println("at");
                break;
            case "$":
                System.out.println("dollar sign");
                break;
            default:
                System.out.println("Error: Enter only symbols!");

        }
    }
}
