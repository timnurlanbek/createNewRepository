package arrayList;

import java.util.ArrayList;

public class IntroToArrayList {
    public static void main(String[] args) {
        ArrayList <String> fruits = new ArrayList<>();

        fruits.add("watermelon");
        fruits.add("apple");
        fruits.add("pear");
        fruits.add("carrot");
        System.out.println(fruits);


        ArrayList <Integer> zipCode = new ArrayList<>();
        zipCode.add(60056);
        zipCode.add(700222);

        // .set(int index, new value, element)


        zipCode.set(0,200222);
        System.out.println(zipCode);

        // .remove(int index) removes the element from the given index

        // sout.size(); shows hom many elements do you have, instead of length

        System.out.println(zipCode.size());

        // ------------------

        // clear(), deletes all elements from ArrayList

        zipCode.clear();
        System.out.println(zipCode);

        // -----------------------------------

        // contains shows whether we have one element or not

        ArrayList <String> shoppingList = new ArrayList <>();
        shoppingList.add("egg");
        shoppingList.add("milk");
        shoppingList.add("socks");
        shoppingList.add("pizza");

        System.out.println(shoppingList.contains("pizza"));
        System.out.println(shoppingList.contains("potato"));

        boolean hasPotato = shoppingList.contains("potato");
        if (hasPotato){
            System.out.println("Yes there is Potato");

        }
        else {
            System.out.println("No there is no potato in your list");
        }



    }
}
