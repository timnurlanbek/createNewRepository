package methods;

public class StringMethods {

    boolean isSame(String str1, String str2) {
        if (str1.equals(str2)) {
            return true;
        }
        return false;
    }


    String concatStrInUpCase(String str1, String str2) {
        return str1.toUpperCase().concat(str2.toUpperCase());
    }

    public static void main(String[] args) {
        StringMethods strMethods = new StringMethods();            // surroo ??? // ? name of class | name of main?? birdei bolush kerekpi

        System.out.println(strMethods.isSame("Tim", "Tim"));
        System.out.println(strMethods.concatStrInUpCase("temirbek", "nurlanbekuulu"));
        System.out.println(strMethods.strConcatnLength("temirbek", "tim"));
        System.out.println(strMethods.IsEven(23432));
        System.out.println(strMethods.IsDivisibleByTen(10));
        tableOfTen(9);
        System.out.println(strMethods.largerOne(15,16));
        System.out.println(strMethods.average(6,7,4,10));
        System.out.println(strMethods.sumOfAllNum(20));
    }


    int strConcatnLength(String str1, String str2) {
        return (str1 + str2).length();
    }


    boolean IsEven(int int1) {
        if (int1 % 2 == 0) {
            return true;
        }
            return false;
    }



    public static void tableOfTen(int int1){
        for (int i = 1; i < 11; i++){
            System.out.println(int1 + " * " + i + " = " + (int1*i));
        }
    }





    boolean IsDivisibleByTen(int int1){
        return int1 % 10 == 0;

    }




    int largerOne (int int1, int int2){
        if (int1 > int2){
            return int1;
        }
        else {
            return int2;
        }
    }


    double average(double int1, double int2, double int3, double int4){
        return (int1 + int2 + int3 + int4) / 4;
    }



    public int sumOfAllNum (int int1){
        int counter = 0;
        for ( int i = 1; i <= int1; i++){
            counter += i;

        }
        return counter;
    }


}

