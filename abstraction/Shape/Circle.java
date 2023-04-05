package abstraction.Shape;

public class Circle extends Shape{
    @Override
    public double getArea() {
        System.out.println("Hi from getArea,Circle");
        return 1.2;
    }

    @Override
    public double getPerimeter() {
        return 1.2;
    }
}
