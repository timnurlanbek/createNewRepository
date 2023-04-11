package encapsulation;

public class Application {
    public static void main(String[] args) {
        Client client1 = new Client();
        client1.name = "Mike";

        client1.setAddress("rolling meadows");
        System.out.println(client1.getAddress());
        Application application = new Application();
        application.setNumber(2270);
        System.out.println(application.getNumber());


    }

    private int number;

    public void setNumber(int number){
        //code
        this.number = number;
    }

    public int getNumber(){
        //code
        return number;
    }
}
