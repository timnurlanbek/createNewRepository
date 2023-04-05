package array;

import java.util.Arrays;

public class IntroToArray {
    public static void main(String[] args) {
        String [] arrayOfFruits = {"apple", "banana", "watermelon", "melon"};

        double [] doubleNumbers = {5.99,17.99,100};
        System.out.println(Arrays.toString(doubleNumbers));

        boolean [] booleans = {true, true, false, false};
        System.out.println(Arrays.toString(booleans));

        char [] chars = {'a','e','i','o','u','y'};
        System.out.println(Arrays.toString(chars));


        //2 option

        String [] names= new String[4];

        // to put elements
        names[0] = "Eshmat";
        names[1] = "Tashmat";
        names [2] = "Asan";
        names [3] = "Uson";

        int [] ages = new int[3];
        ages [0] = 19;
        ages [1] = 25;




        //------------------------------------------

        String [] cars = {"Toyota", "Honda", "Fit", "Chrysler", "Tesla"};

        //

        String [] cars2 = new String[5];
        cars2 [0] = "Toyota";
        cars2 [1] = "Honda";
        cars2 [2] = "Fit";
        cars2 [3] = "Chrysler";
        cars2 [4] = "Tesla";

        //-------------------------------------------------


        double[] prices  = {12.99,5.77,12.33,100.00};
        System.out.println(Arrays.toString(prices));
        // ------------------------------------

        double[] prices2 = new double[3];
        prices2 [0] = 12.99;
        prices2 [1] = 5.77;
        prices2 [2] = 12.33;


        //======================================
        int[] myIntArray1  = new int[3];
        myIntArray1 [0] = 2;
        myIntArray1 [2] = 3;

        System.out.println(Arrays.toString(cars));

        for (String v : arrayOfFruits){
            System.out.println(v);
        }









        //------------------------------------------------------


        System.out.println("""

                                                         The array of cars:
                """);
        for (String car2 : cars2){
            System.out.println(car2);
        }

        // ======================================

        System.out.println("\nThe array of prices:\n");
        for (double v : prices2) {
            System.out.println(v);
        }
        // ======================================

        System.out.println("\nThe array of Names:\n");
        for (String v : names) {
            System.out.println(v);
        }

        //-------------------------------------

        System.out.println("\nThe array of Ages:\n");
        for (int i : ages){
            System.out.println(i);
        }

        //--------------------------------------
        System.out.println("\nThe array of Arrays:\n");
        for (int v : myIntArray1){
            System.out.println(v);
        }

        // ---------------------------------------

        System.out.println("\nThe array of cars:\n");
        for (String v : cars2){
            System.out.println(v);
        }

        //000000000000000000000000000000000000000000000000











    }

}
