package forLoop;

public class NestedLoops {
    public static void main(String[] args) {
// debugger
        for (int int1 = 1; int1 <= 15; int1 +=1){
            for (int int2 = 1; int2 <=15; int2 +=1){
                System.out.print((int1 * int2) + "\t");
            }
            System.out.println();
        }

        for (int int1 = 1; int1 <= 10; int1 +=1){
            for (int int2 = 1; int2 <= int1; int2 +=1){

                System.out.print("*");
            }
            System.out.println("");


        }


                int rows = 10;

                // loop through each row
                for(int i = 1; i <= rows; i++) {

                    // add spaces before the stars
                    for(int j = 1; j <= rows-i; j++) {
                        System.out.print(" ");
                    }

                    // add stars for each row
                    for(int k = 1; k <= (2*i-1); k++) {
                        System.out.print("*");
                    }

                    // move to the next line
                    System.out.println();
                }

                // add trunk of the tree
                for(int i = 1; i <= 3; i++) {
                    for(int j = 1; j <= rows-2; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("***");
                }
            }
        }
        // 4 spaces + 1 star
        // 3 spaces + 2 stars
    /*     2 spaces + 3 stars
    *      1 spaces + 4 stars
    *       0 sppaces + 5 stars*/
