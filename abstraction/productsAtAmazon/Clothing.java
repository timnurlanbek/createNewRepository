package abstraction.productsAtAmazon;

public class Clothing extends Product {
    String fabric, standard_size, color;
    double EU_size;
    int quantity;

    @Override
    public void review() {
        System.out.println("reviewing the:" + title);
    }

    @Override
    public void addToCart(int quantity) {

    }

    @Override
    public void addToCart() {
        System.out.println("adding " + title + " to the cart");
    }

    public void testTheSize(){

    }
}
