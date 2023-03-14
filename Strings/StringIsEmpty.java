package Strings;

public class StringIsEmpty {
    public static void main(String[] args) {
        String veggie1 = "potato";
        String veggie2 = "";

        boolean isEmptyVeggie = veggie1.isEmpty();
        System.out.println("isEmptyVeggie = " + isEmptyVeggie); // false

        System.out.println("veggie2 = " + veggie2.isEmpty()); // True


    }
}
