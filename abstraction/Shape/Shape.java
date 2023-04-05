package abstraction.Shape;

public abstract class Shape  {
    double area = 22.2;
    double perimeter = 22.3;
    public abstract double getArea();

    public abstract double getPerimeter();

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();

        circle.getArea();
        circle.getPerimeter();
        rectangle.getArea();
        rectangle.getPerimeter();
    }



}
