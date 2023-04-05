package hashMap;

import java.util.HashMap;

public class IntroToHashMap {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>();
        // diamond sign <

        capitals.put("USA", "Washington");
        capitals.put("Kyrgyzstan", "Bishkek");
        capitals.put("Italy", "Rome");
        capitals.put("South Korea", "Seoul");
        capitals.put("Moldova", "Kishinev");

        System.out.println(capitals);


        String cityOfItaly = capitals.get("Italy");
        System.out.println(cityOfItaly);

        String cityOfUsa = capitals.get("USA");
        System.out.println(cityOfUsa);

        capitals.remove("Kyrgyzstan");
        System.out.println(capitals);

        // -----------------------------------

        System.out.println(capitals.keySet());
        //System.out.println(capitals.entrySet());
        System.out.println(capitals.values());


        HashMap<String , String > capitals2 = (HashMap)capitals.clone(); // explicit casting
        System.out.println("Cities: " + capitals2);

        // ------------------------

        //





    }
}
