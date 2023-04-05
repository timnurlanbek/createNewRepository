package inhertance.transportation;

public class Transport {


    static {

        System.out.println("this is static block of Trans. constructor");
    }


    {
        System.out.println("instance block of Transport class");


    }

    public  Transport(){
        System.out.println("This is transport constructor without data type");
    }
    public Transport(String type){

        System.out.println("This is transport constructor");
    }

    String type;

    int numOfWheels;
    boolean hasSteeringWheel;

    int numOfSeat;


    public void start (){

    }

    public void accelerate(){

    }

    public void stop(){

    }


}
