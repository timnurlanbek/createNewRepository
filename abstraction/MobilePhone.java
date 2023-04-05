package abstraction;

public abstract class MobilePhone {
    public void regularMethod(){
    }


    String model, color;
    int memory;

    public abstract void call();
    public abstract void text();
    public abstract void ring();
}
