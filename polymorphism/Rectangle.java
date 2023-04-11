package polymorphism;

public class Rectangle extends Shape {

    public void printInfo(){
        System.out.println("This is rectangle");
    }

    public void printInfo(String type){
        System.out.println("This is a " + type);
    }


    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Shape shape = new Shape();
        Shape rectangleShape = new Rectangle();


        // dynamic polymorphism
        rectangle.printInfo();
        rectangleShape.printInfo();
        shape.printInfo();



        //static polymorphism
        rectangle.printInfo("square");

    }

}
