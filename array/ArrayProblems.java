package array;

import java.util.Arrays;

public class ArrayProblems {

    public static int getSum (int [] array){
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }


    public int largestOne(int [] arraysOfInt){
        int larg = arraysOfInt[0];
        for (int i = 0; i < arraysOfInt.length; i++) {
            if (arraysOfInt[i] > larg){
                larg = arraysOfInt[i];
            }

        }
        return larg;
    }


    public int smallestOne(int [] arraysOfInt){
        int smal = arraysOfInt[0];
        for (int i = 0; i < arraysOfInt.length; i++) {
            if (arraysOfInt[i] < smal){
                smal = arraysOfInt[i];
            }

        }
        return smal;
    }


    // 1,2,3,4,5,6,7
    public int secondLargestOne ( int [] arrayOfNums){
        int firstLarg = largestOne(arrayOfNums);
        int secLarg = arrayOfNums[0];
        for (int i = 0; i < arrayOfNums.length; i++) {
            if (secLarg < arrayOfNums[i] & arrayOfNums[i] > firstLarg){
                secLarg = arrayOfNums[i];
            }
        }
        return secLarg;
    }



    // 2,3,5,7,9,0,1
    public int [] ascendingArray (int [] intArray) {
        int order = Integer.MIN_VALUE;
        for (int i = 0; i < intArray.length; i++) {


        }
        return null;
    }
































    public static void main(String[] args) {
        ArrayProblems arrayProblems = new ArrayProblems();
        System.out.println(arrayProblems.largestOne(new int[] {1,2,3,4,5,6,7}));

        System.out.println(arrayProblems.smallestOne(new int[] {1,2,3,4,5,6,7}));

        System.out.println(arrayProblems.secondLargestOne(new int[] {1,2,3,4,5,6,7}));

        int a = 5;
        int b = 10;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

}
