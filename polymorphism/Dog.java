package polymorphism;

public class Dog extends Animal{
    @Override
    public void printDescription() {
        System.out.println("Dogs are pets. There are many breads of dogs.");
    }

    @Override
    public void displayPicture() {
        System.out.println("Here are the cute pictures" + " of dogs");

    }

    @Override
    public void displayFoodInfo() {

    }

    @Override
    public void makeSound() {
        System.out.println("Whoof");
    }
}
