package practiceOOP;

public class Mammal extends Animal {

    public Mammal (){

    }


    public Mammal (String name, int age, double weight, String furColor){
        this.setName(name);
        this.setAge(age);
        this.setWight(weight);
        this.setFurColor(furColor);
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    private String furColor;


}
