package polymorphism;

public interface Vehicle extends Machine {

    void turnOn();
    public abstract void turnOff();

    String name = "Temirbek"; // this is static and final


    static void call(){
        System.out.println("Calling static Vehicle");
    }

}
