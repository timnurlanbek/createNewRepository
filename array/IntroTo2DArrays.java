package array;

import java.util.Arrays;

public class IntroTo2DArrays {

    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5};                                              // values
        System.out.println(Arrays.toString(nums)); //When we want to print all words or integers in array, we use Arrays.ToString
        System.out.println(nums[2]);


        String [] words = {"city", "town", "region", "state"};
        System.out.println(Arrays.toString(words));

        String str = words [0].substring(2);
        System.out.println(str);


        //=======================================================================

        int [][] twoDimensionalArr = {{1,2,3},  {4,5,6} , {7,8,9}, {10,11,12}, {13,14,15} };
        System.out.println(twoDimensionalArr.length);
        System.out.println(twoDimensionalArr[0].length);
        System.out.println(twoDimensionalArr[1].length); //3
        System.out.println(twoDimensionalArr[4].length); // 3


        int b = twoDimensionalArr[1][0];
        System.out.println(b);  // 4

        System.out.println(twoDimensionalArr[0][1]); //2

        System.out.println(twoDimensionalArr[4][1]); //14

        System.out.println(twoDimensionalArr[2][2]); // 9




        // =============================================================

        String [][] twoDimArr= {{"Eshmat", "Tashmat"}, {"Asan", "Uson"} , {" Misha", "Maks"}};
        System.out.println(twoDimArr[0][0] + " + " + twoDimArr[1][0]);
        System.out.println(twoDimArr[0][1] + " + " + twoDimArr[1][1]);
        System.out.println(twoDimArr[2][1] + " + " + twoDimArr[1][0]);



    }
}
