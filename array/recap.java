package array;

import java.util.Scanner;

public class recap {

    public static void main(String[] args) {
        //create array no elements;
        int [] arrInt = new int[5];

        // 2. Create array with elements.
        int [] arrInt2 = {1,2,3,4,5,6};

        // 3. Create array with elements
        int [] arrInt3 = new int[] {1,2,3,4,5,6};



        //------------------------------------------------------

        byte [] bytes1 = new byte[5];

        byte [] bytes2 = {1,2,3,4,5};

        byte [] bytes3 = new byte[] {1,2,3,4,5};


        // --------------------------------------

        double [] doubles1 = new double[5];

        double [] doubles2 = {1,2,3,4,5};

        double [] doubles3 = new double[] {1,2,3,4,5};

        // ---------------------------------

        boolean [] booleans1 = new boolean[5];

        boolean [] booleans2 = {true, false, true, false, true, false};

        boolean [] booleans3 = new boolean[] {true, false, true, false, true, false};


        Scanner sc = new Scanner(System.in);
        boolean b = sc.nextBoolean();
        if (b == false){
            System.out.println("tim");
        }
    }
}
