package abstraction.Shape;

public class Rectangle extends Shape {


    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPerimeter() {
        System.out.println("Below is perimeter,Rectangle\n" + perimeter);
        return perimeter;
    }
}
