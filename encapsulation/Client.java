package encapsulation;

public class Client {

    String name;

    private String address;
    String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    private String creditCardNumber;


    // ----------------------------------------




    public void setAddress(String address){
        if (address.contains("USA")){
            this.address = address;
        }
    }

    public String getAddress(){
        return address;
    }
}
