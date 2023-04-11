package polymorphism;

public class Automobile implements Vehicle, Machine{
    @Override
    public void turnOn() {
        System.out.println("auto is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("auto is terned off");
    }

    @Override
    public boolean needService() {
        return false;
    }

    @Override
    public void work() {

    }

    @Override
    public boolean isBroken() {
        return false;
    }

    @Override
    public void helpPeople() {

    }

    public static void main(String[] args) {
        Automobile automobile = new Automobile();
        Vehicle vehicle = new Automobile();
        Machine machine = new Automobile();


    }

    public void calling (){

    }
}
