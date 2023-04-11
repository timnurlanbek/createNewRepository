package polymorphism;

public class Man extends Person {

    public void methodInstance(){
        new Person().instanceMethod();

        new Person().instanceVariable = "a";

        instanceMethod();
        instanceMethod();
        instanceVariable = "a";
        instanceVariable = "b";
        staticVariable = "c";
    }

    public static void main(String[] args) {
        new Person().instanceMethod();

    }

}
