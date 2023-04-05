package problemSolving;

import java.util.Arrays;


public class AverageValueOfArray {


    public static double averageValueOfArray(int [] arr){
        int sum = 0;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length -1; i++){
            sum += arr[i];

        }
        return (double) sum / (arr.length);
    }


    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8};
        System.out.println(averageValueOfArray(numbers));
    }


}



