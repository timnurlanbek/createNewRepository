package array;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        int [] oneD = {1,2,3};
        int [][] twoD = { {1,2,3} , {4,5,6}};
        int [][] twoD2 = { oneD , {4,5,6}};

        int [] [] [] threeD = {
                { {1,1,1 },{11,11,11}},
                { {2,2}, {3,3}, {123}},
                {oneD, {13}, {54}}

        };


        int [][][][] fourD = { threeD, {twoD} , { { oneD} }};
        int [][][][][] fiveD = {fourD , {threeD}, {{twoD2}} , {{{oneD}}}};




        for (int a = 0; a < fourD.length; a ++){
            for (int b = 0; b < fourD[a].length; b ++){
                for (int c = 0; c < fourD[a][b].length; c ++ ){
                    for (int d = 0; d <fourD[a][b][c].length; d ++){
                        System.out.print(fourD[a][b][c][d] + " \t");
                    }
                    System.out.println("\t\t");
                }
                System.out.println("\t");
            }
            System.out.println();
        }




        System.out.println(threeD[1][2]);


        /*for (int a = 0; a < threeD.length; a ++){
            for (int b = 0; b < threeD[a].length; b ++){
                for (int c = 0; c < threeD[a][b].length; c ++){
                    System.out.print(threeD[a][b][c] + " ");
                }
                System.out.print("\t\t\t");
            }
            System.out.println();
        }*/


        for (int i = 0; i < 10; i++) {
            System.err.println(i);

        }



    }
}
