package practiceOOP;

public abstract class Animal {
    String name;
    int age;
    double wight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }



    public void makeSound(){
        System.out.println( name + " is making sound");
    }
}
