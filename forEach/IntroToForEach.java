package forEach;

import java.awt.image.Kernel;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntroToForEach {

    public static void main(String[] args) {

        /*
        * Collection: array, arrayList*/

        // For each loop works with only collections
        //




        // for each loop does not need boolean statement, it needs only collection


        String [] array = {"potato", "onion", "carrot", "pepper"};

        for (String a: array) {
            System.out.println(a);
        }




        int [] intArray = {1,2,3,4,5,6,7,78,8};
        for (int int1 : intArray) {
            System.out.print("\n"+int1);

        }




        // ----------------------------------------------------


        byte [] byteArray = {20,100,125,127,-23,54};

        double [] doubleArray = {1.99,2.99,3.45,4.34,6.99,100.00};
       // ArrayList <Double> doubleArrayList = new ArrayList<>(Arrays.asList(doubleArray));

        ArrayList <Double> arrayListOfDouble =  new ArrayList<>();
        arrayListOfDouble.add(1.99);
        arrayListOfDouble.add(2.99);
        arrayListOfDouble.add(3.45);

        for (double d :
                arrayListOfDouble) {
            System.out.println(d);
        }

// --------------------------------------------------------------
        String [] stringArray = {"Tim", "Ali", "IamBekAnabiev", "JimCarry", "Donald J Trump"};

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(stringArray));

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));

        }
        for (String str :
                arrayList) {
            System.out.println(str);
        }

// ---------------------------------------------------------------
        boolean [] booleanArray = {true,true,true,true,true};

        for (int i = 0; i < byteArray.length; i++) {

        }

    }
}
