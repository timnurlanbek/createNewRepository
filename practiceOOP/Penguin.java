package practiceOOP;

public class Penguin extends Bird {

    public Penguin(){

    }

    public Penguin (String name, int age, double weight, double wingSpan){
        super(name, age, weight, wingSpan);
    }
    public void makeSound(){
        System.out.println("Penguin is kwaking");
    }

    public void swim(){
        System.out.println("Penguin is swimming");
    }
}
