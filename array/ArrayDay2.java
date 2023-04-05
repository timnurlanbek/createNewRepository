package array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDay2 {
    public static void main(String[] args) {
        int[] arrays = new int[100];
        int k = 2;

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = k;
            k += 2;
        }
        System.out.println(Arrays.toString(arrays));


        int[] arraysOdd = new int[50];
        int l = 1;
        for (int i = 0; i < arraysOdd.length; i++) {
            arraysOdd[i] = l;
            l += 2;
        }
        System.out.println(Arrays.toString(arraysOdd));

        // ----------------------------------------------------------------------


        double [] arrayDouble = new double[10];

        double d = 0.1;

        for (double i = 0.1; i < arrayDouble.length; i ++){
            arrayDouble[(int) i] = d;
            d += 0.1;
        }
        System.out.println(Arrays.toString(arrayDouble));


        // ----------------------------------------------------------------------


        int [] prime = new int[100];

        ArrayList<Integer> primeNum1 = new ArrayList<Integer>();
        for (int i = 1; i < prime.length; i ++){
            if (i % 2 == 0){
                continue;
            }
            else {
                primeNum1.add(i);
            }
        }
        System.out.println(primeNum1);


        // ArrayList<Integer> int1 = new ArrayList<Integer>();
        // int1.add(i)
        //sout(int1)

        ArrayList<String> str1 = new ArrayList<String>();
        str1.add("Tima");
        str1.add("Eshmat");
        str1.add("Asan");
        System.out.println(str1);





    }
}




        // ------------------------------------------
