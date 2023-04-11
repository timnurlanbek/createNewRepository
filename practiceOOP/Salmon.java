package practiceOOP;

public class Salmon extends Fish{

    public Salmon (){
    }

    public Salmon(String name, int age, double weight, String waterType){
        super(name,age,weight,waterType);
    }

    public void makeSound(){
        System.out.println("Salmon is cute");
    }
}
