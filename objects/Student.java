package objects;

public class Student {
    String name;
    int age;
    String email;
    String major;
    String phone;


    public void read(){
        System.out.println( name + " is reading");
    }

    public void attendClass(){
        System.out.println(name + " is attending " + major);
    }

    public void printInfo(){
        System.out.println("Student name is " + name + ". And student is" + age + " years old");
        System.out.println("Student studies " + major);
        System.out.println("Student's contact (email: " + email + ", phone: " + phone + ")");
    }


    public void sleep(){
        System.out.println(name + " is sleeping!");
    }
    // this is bluepring
}
