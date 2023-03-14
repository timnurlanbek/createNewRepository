package objects;

public class car {
    String car;
    String model;
    String price;
    String year;
    String color;

    public void drive(){
        System.out.println( car + " driving : " + model);

    }
    public void stop(){
        System.out.println(car + " stopped at Asia mall.");
    }

    public void allInfoCar(){
        System.out.println(car + "'s model is " + model);
        System.out.println(car + "'s year is " + year);
        System.out.println(car + "'s color is " + color);
        System.out.println(car + "'s price is " + price);

    }


    public static void main(String[] args) {
        car car1 = new car();
        car1.car = "Toyota";
        car1.model = "Prius";
        car1.year = "2007";
        car1.color = "Gray";
        car1.price = "$5700";


        car car2 = new car();
        car2.car = "Toyota";
        car2.model = "Camry";
        car2.year = "2007";
        car2.color = "White";
        car2.price = "$5500";


        car1.allInfoCar();
        car2.allInfoCar();
        car1.drive();
        car1.stop();
    }



}
