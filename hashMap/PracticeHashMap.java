package hashMap;

import java.util.HashMap;


public class PracticeHashMap {
    public static double getPriceOfFruit(HashMap<String, Double> fruits, String fruitName ){
        System.out.println(fruits.get(fruitName));
        return fruits.get(fruitName);
    }

    public static void main(String[] args) {
        HashMap <String, Double> fruitNames = new HashMap<>();
        fruitNames.put("kiwi", 2.99);
        fruitNames.put("banana",1.59);
        fruitNames.put("mango", 4.99);
        fruitNames.put("apple", 4.39);

        System.out.println(fruitNames.get("banana"));

        getPriceOfFruit(fruitNames, "kiwi");
        getPriceOfFruit(fruitNames, "apple");



        // ---------------------------------------------------

        HashMap <String , Double> StockNames = new HashMap<>();
        StockNames.put("Apple", 123.99);
        StockNames.put("Microsoft", 321.233);
        StockNames.put("YouTube", 10032.32);

        findTheHighestStockPrice(StockNames);
        findTheLowestStockPrice(StockNames);
        theAverageOfStockPrice(StockNames);
        secondHighestStockPrice(StockNames);

    }



    //000000000000000000000000000000000000000000000000000000000

    public static double findTheHighestStockPrice (HashMap<String, Double> stocks){
        double highest = Integer.MIN_VALUE;
        String highestStockName = "";
        for (String d :
                stocks.keySet()) {
            if (stocks.get(d) > highest) {
                highest = stocks.get(d);
                highestStockName = d;
            }
        } {

        }
        System.out.println("The highest stock is " + highestStockName + " with value of: " + highest);
        return highest;
    }


    public static double findTheLowestStockPrice (HashMap <String, Double> stocks){
        double lowest = Integer.MAX_VALUE;
        String lowestStockName = "";

        for (String d :
                stocks.keySet()) {
            if (stocks.get(d) < lowest){
                lowest = stocks.get(d);
                lowestStockName = d;
            }
        }
        System.out.println("The lowest stock is " + lowestStockName + " with value of: " + lowest);
        return lowest;

    }

    public static double theAverageOfStockPrice (HashMap <String, Double> stocks){
        int counter = 0;
        double sum = 0;
        for (String str :
                stocks.keySet()) {
            sum = sum + stocks.get(str);
            counter ++;

        }
        System.out.println("The average of Stock Price is: " + sum / counter);
        return sum /counter;
    }




    public static double secondHighestStockPrice (HashMap <String, Double> stocks){
        double highest = findTheHighestStockPrice(stocks);
        double secondHighest = Integer.MIN_VALUE;
        String secondHighestName = "";
        for (Double value : stocks.values()){
            if (value != highest && value > secondHighest ){
                secondHighest = value;
            }

        }
        System.out.println("The second highest stock price is " + secondHighestName + ": " + secondHighest);
        return secondHighest;
    }

    public static HashMap <String, Double> removeStocksBelowLimit (HashMap <String, Double> stocks, double limit){
        // expecting hashmap method, and return hashmap
        // remove all stock

        HashMap <String , Double > newStocks = new HashMap<>();

        for (String temp :
                stocks.keySet()) {
            if (stocks.get(temp) > limit) {
                newStocks.put(temp, stocks.get(temp));
            }
            }
        return newStocks;

        // --------------- just



    }
}
