package array;

import java.util.Arrays;

public class PracticeArrays {

    public static void main(String[] args) {
        String [] cities = {"Barcelona", "Milan", "Bishkek", "Chicago", "Abdusamat", "Tokyo"};

        //System.out.println(cities[1].startsWith("B")); // false

        String capitalOfKyrgyzstan = cities[2];
        System.out.println(Arrays.toString(capitalOfKyrgyzstan.toCharArray()));

        System.out.println("This winter I want to visit to " + cities[cities.length-1]);

        String [] countries = {"Columbia", "Turkey", "South Korea", " Switzerland", "Australia"};
        System.out.println("All the best fruits come from " + countries[0]); // Columbia
        System.out.println(countries[2] + " is not same as North Korea");
        System.out.println(countries[1] + "'s capital is Ankara");
        System.out.println(countries[countries.length-2] + "has the best skiing resorts");
        System.out.println(countries[countries.length-1]);
        System.out.println(
                countries[countries.length-1].substring(2) + "\n" +
                countries[countries.length-1].substring(3) + "\n" +
                countries[countries.length-1].substring(4) + "\n" +
                countries[countries.length-1].substring(5) + "\n" );



        int [] tenNumbers = {10,20,30,40,50,60,70,80,90,100};
        for (int tenNumber : tenNumbers) {
            System.out.print(tenNumber + " " );
        }
        for (int v : tenNumbers){
            System.out.println("\n" + v);
        }

    }

}
