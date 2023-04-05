package inhertance.transportation;

public class MotorizedTransport extends Transport{


    public MotorizedTransport(){
        super("motorized");
        System.out.println("this is motorized constructor");
    }

    {
        System.out.println("this is motorizedTransport first static block");
    }

    {
        System.out.println("this is motorizedTransport second static block");
    }

    {
        System.out.println("this is motorizedTransport third static block");
    }

    {
        System.out.println("this is motorizedTransport forth static block");
    }




    String engine_type;

    int max_speed;

    public void drive(){

    }

    public void signal(){

    }

    public static void main(String[] args) {
        MotorizedTransport automobile = new MotorizedTransport();

    }


}
