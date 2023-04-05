package array;

import java.util.Arrays;

public class SameLast {
    public static boolean sameLastFirst (int [] arr){
        return arr[0] == arr[arr.length - 1];
    }

    public static boolean threeSame (String [] array){
        return array.length >= 3 && array[0].equals(array[array.length - 1]);

    }

    public static void main(String[] args) {
        int [] numbers1 = {1,2,3,4,5,6,1};
        int [] numbers2 = {1,2,3,4,5,6};
        int [] numbers3 = {1};

        System.out.println(sameLastFirst(numbers1));
        System.out.println(sameLastFirst(numbers2));
        System.out.println(sameLastFirst(numbers3));



        // -------------------
        System.out.println("Is True numbers: " +sameLastFirst( new int [] {1,2,3,4,5,7,1}));



        //======================================================================

        String [] array2 = {"tim", " sim" , "kim", "bim"};
        String [] arr3 = {"tim","tim","sim","kim","tim"};
        System.out.println(threeSame(array2));
        System.out.println(threeSame(arr3));

        Arrays.sort(array2);
        System.out.println("Sorted array:" + Arrays.toString(array2));

    }
}
