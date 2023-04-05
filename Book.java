public class Book {

    String title;

    String author;

    String category;




    public static void main(String[] args) {
        Book book1 = new Book();
        book1.author = "Jim Rohn";
        book1.category = "Non-Fiction";
        book1.title = "Compound Effect";                // first option



        // calling car object

        Car car1 = new Car();
        Car car2 = new Car("prius","toyota");
        Car car3 = new Car("camry","toyota", 2023);

        car2.printInfo();

    }

    public Book (){

    }


    public Book (String titleOfBook, String authorOfBook, String categoryOfBook){ // better option
        title = titleOfBook;
        author = authorOfBook;
        category = categoryOfBook;
    }


    // --------------------------------------------------------------------


}
