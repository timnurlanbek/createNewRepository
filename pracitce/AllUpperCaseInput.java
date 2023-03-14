package pracitce;

import scannerClass.ScannerHasNext;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class AllUpperCaseInput {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String inputSentence = myObj.nextLine();

        System.out.println(inputSentence.toUpperCase());


    }
}
