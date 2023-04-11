package practiceOOP;

import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal (Animal animal){
        animals.add(animal);
    }


    public void removeAnimal(Animal animal){
        animals.remove(animal);
    }


    public void listAnimals(){
        for (Animal animal :
                animals) {
            System.out.println(animal.name + " " + animal.age);
        }
    }



}
