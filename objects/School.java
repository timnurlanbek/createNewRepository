package objects;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Leo";
        student1.phone = "44324324";
        student1.age = 21;
        student1.major = "Computer Science";
        // variables already created in student class

        Student student2 = new Student();
        student2.name = "Eshmat";
        student2.phone = "+1 623 237 32 32";
        student2.age = 19;
        student2.major = "Law";

        student2.attendClass();

    }
}
