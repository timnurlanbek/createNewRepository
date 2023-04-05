package abstraction.productsAtAmazon;

public class Books extends Product {
    String author;
    String genre;
    String language;
    boolean isBestSeller;
    boolean isAudioBook;
    boolean isKindleBook;
    boolean isPaperBook;


    @Override
    public void review() {
        System.out.println("This is review from book");
    }

    @Override
    public void addToCart(int quantity) {

    }

    @Override
    public void addToCart() {

    }


}
