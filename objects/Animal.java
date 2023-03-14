package objects;

import java.util.random.RandomGenerator;

public class Animal {
    String type;
    boolean IsMammal;
    boolean isCarnivare;
    int age;
    String habitat;

    public void eat(){
        System.out.println("Is " + type + " eats animals: " + isCarnivare);
    }
    public  void sleep(){
        System.out.println(type + " sleeps in " + habitat);
    }
    public void play(){
        System.out.println(type + " is " + age + " years old and he plays a lot");
    }


}
