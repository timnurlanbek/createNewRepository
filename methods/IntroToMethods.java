package methods;

import org.w3c.dom.ls.LSOutput;

public class IntroToMethods {

    void  methodName(){
        /*
        * any logic*/

    }                // void return type. this is << return type >>

    static int sum(int a, int b){
        return a + b;
    }


    int lengthOfStr(String str){
        return str.length();
    }


    public static void main(String[] args) {
        // Either we create object or put static to every method
        IntroToMethods intro = new IntroToMethods();
        System.out.println(intro.lengthOfStr("Temirbek"));

        int result = sum(1,4);

        System.out.println(result);

        int int1 = getZero();

        System.out.println(int1);

        double getParameter = perimeterOfTriangle(4,5,3);
            System.out.println(getParameter);



    }




    //====================================================================

    String getCapitalOfFrance(){
        return "Paris";
    }


    double getPi(){
        return 3.234;
    }

    static int getZero(){
        return 0;
    }


    static double perimeterOfTriangle(double tri1, double tri2, double tri3){
        return (tri1 + tri2 + tri3);
    }







}
