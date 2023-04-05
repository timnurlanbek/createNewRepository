package array;

import java.util.Arrays;

public class practiceEquals {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3};
        int [] arr2 = {1,2,3,4};
        int [] arr3 = {1,3,2};
        int [] arr4 = {1,3,2};
        int [] arr5 = {1,2,4,3};

        System.out.println(Arrays.equals(arr1,arr2)); // false
        System.out.println(Arrays.equals(arr2,arr5)); // false
        System.out.println(Arrays.equals(arr3,arr4)); // true

        //=========================================================
        //Arrays.fill


        String [] colors = new String [20];
        Arrays.fill(colors, "red");
        System.out.println(Arrays.toString(colors));


        String [] attendance = new String [10];
        Arrays.fill(attendance, "absent");
        System.out.println(Arrays.toString(attendance));


        //=======================================================
        //CopyOf

        int [] int1 = {1,2,4};
        int [] int2 = Arrays.copyOf(int1,2);

        System.out.println(
                Arrays.toString(int1) + "\n" +
                Arrays.toString(int2));



    }


}
