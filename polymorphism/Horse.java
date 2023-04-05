package polymorphism;

public class Horse extends Animal{
    @Override
    public void printDescription() {
        System.out.println("Horses are beautiful and can run long distances");
    }

    @Override
    public void displayPicture() {
        System.out.println("here is the horse");
    }

    @Override
    public void displayFoodInfo() {
        System.out.println("horses eat veggies only");
    }

    @Override
    public void makeSound() {
        System.out.println("Eehoo");
    }


    public static void main(String[] args) {
        Horse horse = new Horse();
        Dog dog = new Dog();

        Animal aniHorse = new Horse();
        Animal aniDog = new Dog();

        horse.playAnimalsMusic();

    }
}
