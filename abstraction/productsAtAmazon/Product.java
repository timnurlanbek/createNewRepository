package abstraction.productsAtAmazon;

public abstract class Product {
    String title;
    double price;
    String description;
    String seller;
    int reviews;
    int quantity;


    public abstract void review();

    public abstract void addToCart(int quantity);

    public abstract void addToCart();



    public static void main(String[] args) {
        Product b = new Books();     // first one is parent and then child steps
        Product c = new Clothing();

        c.review();

        b.review();
    }
}


