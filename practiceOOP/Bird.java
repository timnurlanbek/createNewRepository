package practiceOOP;

public class Bird extends Animal{

    public Bird (){

    }

    public Bird(String name, int age, double weight, double wingSpan){
        this.setName(name);
        this.setAge(age);
        this.setWingSpan(wingSpan);
        this.setWight(weight);
    }

    private double wingSpan;

    public double getWingSpan(){
        return wingSpan;
    }

    public void setWingSpan(double wingSpan){
        this.wingSpan = wingSpan;
    }

    public void fly(){

    }
}
