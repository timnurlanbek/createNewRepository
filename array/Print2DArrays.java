package array;


public class Print2DArrays {


    public static void main(String[] args) {
        String [][] foods = {
                {"pasta", "lasagna", "pizza"},
                {"rice","wok", "mongolian"},
                {"borsh","pelmeni","varenki"},
                {"plov", "samsy", "oromo"}
        };


        System.out.println(foods [0][0]);
        System.out.println(foods [1][2]);
        System.out.println(foods [2][0]);
        System.out.println(foods [3][1]);
        System.out.println(foods [1][2]);


        for (int i = 0; i < foods.length; i ++ ){
            for (int j = 0; j < foods[i].length; i ++){
                System.out.println(foods[i][j]);
            }
        }
    }





}
