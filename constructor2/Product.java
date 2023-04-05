package constructor2;

public class Product {
    String name, manufacturer;

    double price;

    int quantity;

    public Product(){
        name = "unknown";
        price = 0.0;
        quantity = 0;
        manufacturer = "unknown";
    }

/*
A parameterized constructor that takes in values for the name,
price, quantity, and manufacturer properties.*/

    public Product(String name, double price, int quantity, String manufacturer){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.manufacturer = manufacturer;
    }



    public Product(String name, int price, int quantity, String manufacturer){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.manufacturer = manufacturer;
    }


    /*
    A method named "getDetails" that returns a
    string with the product's name, price, quantity, and manufacturer.
     */

    public String getDetails (){
        String info = name + ": " + "$ \n" +
                "Quantity: " + quantity + "\n" +
                "Manufacturer: " + manufacturer;
        return info;
    }


    public double getTotalPrice (){
        return price * quantity;
    }


    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product("Orange Juice", 12.23, 23, "ABC");

        System.out.println(product2.getDetails());
    }


}


