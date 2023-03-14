package methodOverloading;

public class ArithmeticOperations {

    public static int sumOfTwoInt (int int1, int int2){
        return (int1 + int2);
    }




    public static void main(String[] args) {
        int sum = sumOfTwoInt(2,2);
        System.out.println(sum);

    }
}
