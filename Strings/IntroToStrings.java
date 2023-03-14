package Strings;

public class IntroToStrings {
    public static void main (String [] args) {
/*
        String character_name = "Temirbek";
        System.out.println(character_name);

        String lastName = "Nurlanbek uulu";
        System.out.println(lastName);

        String fullName = character_name+" "+lastName;
        System.out.println(fullName);

        character_name = "Duishobai uulu";
        lastName = " Ermek ";
*/

        /*

        create
        -
        -
        -
        -
        -
        -
        -
        -
        -

         */

/*
        String myName = "Temirbek";
        String lastName2 = "Nurlanbek uulu";
        byte myAge = 21;
        String myAddress = "565 W Franklin Dr, Chicago, IL 60056";
        String myMobile1 = "+1 615-964-42-12";

        String myInfo = " Full name: " + myName + " " + lastName2 + "."+"\n"
                        + " I am " + myAge + " years old."+"\n"
                        + " And my address is " + myAddress + "! " + "\n"
                        + " My phone number is " + myMobile1 + "! " + "\n";

        System.out.println(myInfo);
 contcantination = biriktiruu
        String fruit = "apple";
        String fruit2 = new String("banana");
        System.out.println(fruit + "\n" + fruit2);
 System.out.println("banana");
*/


        String name = "Antananarivo";
        System.out.println("The length of Antananarivo is: = " + name.length());

        // heap memory is like ram memory ??
        // Stack memory is what stays long;

        String fruit1 = "apple";
        String fruit2 = "apple";
        String fruit3 = "Apple";

        boolean isSame = true;

        isSame = fruit1.equals(fruit3);
        System.out.println("isSame = " + isSame);

        fruit1 = "banana";
        fruit2 = "orange";

        System.out.println(" Is banaana same as orange :" + fruit1.equals(fruit2));

        int cucumber = 5;
        int tomato = 10;

        System.out.println("cucumber: " + cucumber);
        System.out.println("tomato" + tomato);

        int empty = cucumber;
        cucumber = tomato;
        tomato = empty;

        System.out.println("cucumber = " + cucumber);
        System.out.println("tomato = " + tomato);


        // =======================================

        int Apple = 20;
        int Nak = 30;

        System.out.println("apple = " + Apple);
        System.out.println("Nak = " + Nak);

        int empty2 = Apple;
        Apple = Nak;
        Nak = empty2;


        System.out.println("Apple = " + Apple);
        System.out.println("nak = " + Nak);

        // ++++++++++++++++++++++++++++++++++

        String state1 = "California";
        String state2 = "Illinois";
        String state3 = "Florida";
        String state4 = "IlLinois";
        String state5 = "florida";

        /*
        create boolean variable for every comparison, and print

        compare state1 with state2 --> True
        compare state2 with state4 >>+ True


         */

        boolean isEqual2 = true;

        isEqual2 = !state1.equals(state2);
        System.out.println("Is state 1 equal to state 2 = " + isEqual2);

        isEqual2 = state2.equals(state4);
        System.out.println("isEqual2 state 2 and state 4 = " + isEqual2);

        //=====================================================

        String country1 = "USA";
        String country2 = "USA";
        String country3 = new String("USA");

        System.out.println(country1 == country2);
        System.out.println(country1 == country3);


        System.out.println(country1.equals(country2));
        System.out.println(country1.equals(country3));


        // ------------------------------------------------
        //At home practice

        String name2 = "Aidana";
        String name3 = "Aidana";
        System.out.println("name3 = " + name3);
        System.out.println("name2 = " + name2);

        name2 = "Aidana Omorova";
        System.out.println("name2 = " + name2);

        name2 = "Temirbek";
        System.out.println("name2 = " + name2);

        name2 = name3;
        System.out.println("name2 = " + name2);
        // Immutable string tushunbodum






    }
}
