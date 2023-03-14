package objects;

public class Zpp {
    public static void main(String[] args) {


        Animal animal1 = new Animal();
        animal1.type = "Giraffe";
        animal1.IsMammal = true;
        animal1.isCarnivare = false;
        animal1.habitat = "Africa";
        animal1.age = 14;


        Animal animal2 = new Animal();
        animal2.type = "Lion";
        animal2.isCarnivare = true;
        animal2.IsMammal = false;
        animal2.habitat = "Africa";
        animal2.age = 3;



        animal1.eat();
        animal1.play();
        animal1.sleep();
    }


}
