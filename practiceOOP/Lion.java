package practiceOOP;

public class Lion extends Mammal{

    public Lion(){

    }

    public Lion (String name, int age, double weight, String furColor){
        super(name, age, weight, furColor);
    }
    public void makeSound(){
        System.out.println("Lion is Roaring");
    }

}
