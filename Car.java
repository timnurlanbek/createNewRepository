public class Car {

    String make, model;

    int year;

    public Car (){
        make = model = "Unknown";
        year = 0;
    }


    public Car (String model, String make, int year){
        this.model = model;
        this.make = make;
        this.year = year;
    }

    public Car (String make, String model){
        this.make = make;
        this.year = 0;
        this.model = model;
    }


    public void printInfo (){
        System.out.println(
                "Make: " + make
                + "Model" + model
                + "Year" + year
        );
    }






}
