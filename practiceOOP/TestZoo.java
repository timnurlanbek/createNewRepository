package practiceOOP;

import java.util.ArrayList;

public class TestZoo {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.setName("Simba");
        lion.setAge(7);
        lion.setFurColor("yellow");
        lion.setWight(200);



        Penguin penguin = new Penguin();
        penguin.setName("Kovalsky");
        penguin.setAge(3);
        penguin.setWingSpan(1);
        penguin.setWight(50);

        Salmon salmon = new Salmon();
        salmon.setName("Alaska");
        salmon.setAge(5);
        salmon.setWaterType("salt");
        salmon.setWight(2);


        Zoo zoo = new Zoo();
        zoo.addAnimal(lion);
        zoo.addAnimal(penguin);
        zoo.addAnimal(salmon);

        zoo.listAnimals();

        zoo.removeAnimal(lion);


        //--------------------------------

        zoo.addAnimal(new Lion("Simba", 2, 140, "brown"));

        Animal penguin2 = new Bird("Shkipper", 2 , 60, 90);

        Animal penguin3 = new Penguin("Isa", 1,45,1);

        Penguin penguin4 = new Penguin("Ricko", 2, 43, 2);

        Bird penguin5 = new Penguin("Private", 3 , 50, 2);

        // ---------------------------




    }
}
