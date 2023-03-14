package AllHomeWorks;

public class Rectangle {

    double height;
    double width;

    public static void areaOfRectangle (double height, double width){
        System.out.println("The area of rectangle is: " + (height * width));
    }

    public static void perimeterOfRectangle (double height, double width){
        System.out.println("The perimeter is: " + (height + width) * 2);
    }

    public static void main(String[] args) {
        areaOfRectangle(12,12);
        perimeterOfRectangle(12,12);
    }

}
