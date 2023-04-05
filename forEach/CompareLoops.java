package forEach;

public class CompareLoops {
    public static void main(String[] args) {
        /*int [] array = {1,2,3,4,5,6,6,7,8};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

        // while loop
        int i = 0;
        while (i < array.length){
            System.out.println(array[i]);
            i++;
        }


        // ------------------

        //do while loop
        int a = 0;
        do {
            System.out.println(array[a]);
            a++;

        }while (a < array.length);

        //--------------------------------------------------

        for (int int1 :
                array) {
            System.out.println(int1);
        }*/

        // =====================================================


        int [] arrayOfInts = {34,655,34,6,7,8,9,10,5};
        int sum = 0;
        //1.
        for (int j = 0; j < arrayOfInts.length; j++) {
            sum = sum + arrayOfInts[j];
        }
        System.out.println("The average of ints: " + ((double) sum / arrayOfInts.length));

// ----------------------------------------------------------------------
        int sum2 = 0;
        for (int ints :
                arrayOfInts) {
            sum2 += ints;
        }
        System.out.println("The average of ints is: " + ((double) sum2 / arrayOfInts.length));


        // =====================================================
    }
}
