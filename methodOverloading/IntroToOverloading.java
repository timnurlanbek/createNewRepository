package methodOverloading;

public class IntroToOverloading {

    /*
    * method names must be special. We cannot have two or more methods to use the same*/

    public int getAreaRectangle (int length, int width){
        return length + width;



    }public int getAreaRectangle (long length, int width){
        return (int) length + width;
    }

    // We are overloading the method, exactly one method






    public static boolean intIsPrime (int int1){
        for (int i = 2; i < int1; i++){
            if (int1 % i == 0){
                System.out.println(false);
                return false;
            }
        }
        return true;

    }




    public static int getAreaOfTriangle (short base, short height){
        return (base * height) / 2;


    }

    public static int getAreaOfTriangle (int a, int b, int c){
        return (a + b + c) / 2;


    }
    public static int getAreaOfTriangle (long a, long b, long c){
        long s = (a + b + c) / 2;
        return (int) Math.sqrt (s * (s-a)*(s-b)*(s-c));
    }















    // ------------------------------------------------------------------


    /*public double getPerimeterOfSquare (double int1, double int2, double int3, double int4){
        System.out.println("Perimeter of Square: " + (int1 + int2 + int3 + int4));

    }public long getPerimeterOfSquare (int int1, double int2, double int3, double int4){
        System.out.println("Perimeter of Square: " + (int1 + int2 + int3 + int4));

    }public int getPerimeterOfSquare (long int1, double int2, double int3, double int4){
        System.out.println("Perimeter of Square: " + (int1 + int2 + int3 + int4));
    }

     */


    public static void main(String[] args) {
        intIsPrime(71);

    }



}
