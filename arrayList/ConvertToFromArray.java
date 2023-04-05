package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertToFromArray {

    public static void main(String[] args) {
        ArrayList <String> vegetables = new ArrayList<>();

        vegetables.add("potato");
        vegetables.add("cabbage");
        vegetables.add("pepper");
        vegetables.add("lettuce");

        String [] arrayOfVegetables = new String[vegetables.size()];

        vegetables.toArray(arrayOfVegetables    );


        /*
         Convert ARray to Arraylist
         */

        Integer [] arrayOfInts = {1,2,3,4,5,6,7};

        List<Integer> arrayListOfInts = Arrays.asList(arrayOfInts);

        System.out.println(arrayListOfInts.size());
        System.out.println(arrayListOfInts);

        // ----------------------------------------------------------------------------------



    }


}
