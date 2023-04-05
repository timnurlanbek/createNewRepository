package array;

import java.util.Arrays;

public class PractiseSort {
    public static void main(String[] args) {

        int [] numbers = {2,5,2,3,4,25,7,65,47,54,21};
        System.out.println(Arrays.toString(numbers));

        //Ascending order
        Arrays.sort(numbers);
        //Descending order

        System.out.println(Arrays.toString(numbers));



    }
}
