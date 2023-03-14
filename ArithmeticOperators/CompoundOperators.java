package ArithmeticOperators;

public class CompoundOperators {

    public static void main(String[] args) {
        int a = 5;
        a++; // a = a + 1
        a++; // a = a + 1
        a++; // a = a + 1           ++ means to add 1

        System.out.println(a);

        a--;
        System.out.println(a);

        int age = 18;
        System.out.println(age++); // post increment 18, ,birinchi daiardalat anan print kylganda chonoiot
        System.out.println(age); // 19

        int money = 20;
        money +=3; // money = money + 3
        System.out.println(money);

        money *=2; // money * 2
        System.out.println(money);

        money /=4; // money / 4
        System.out.println(money);

        money %= 2; // money % 2 = 0
        System.out.println(" Modulus "+money);
        System.out.println("money = " + money);

        int abc = 20%2;
        System.out.println(abc);


        


    }
}
