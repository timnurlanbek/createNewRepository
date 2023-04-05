package forEach;

import java.util.ArrayList;

public class MorePractice {

    public static void main(String[] args) {

        int [] numbers2 = {1,2,34,5,654,3,4,3,2,6,2};
        int [] rearrangedArray = rearrangeArray(numbers2);

        for (int i = 0; i < rearrangedArray.length; i++) {
            System.out.print(rearrangedArray[i] + " ");

        }
        System.out.println("\n\t");
        for (int int1 :
                rearrangedArray) {
            System.out.print(int1 + " ");
        }





        
    }



    public static int [] rearrangeArray (int [] array){
        int [] newArray = new int[array.length];
        int index = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                newArray[index] = j;
                index++;
            }

        }

        for (int j : array) {
            if (j % 2 != 0) {
                newArray[index] = j;
                index++;
            }

        }
        return newArray;



    }



    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int a:
                nums){
            if (nums[a] == 2){
                sum+= a;
            }
        }
        return sum == 8;
    }
}
