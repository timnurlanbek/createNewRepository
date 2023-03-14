package Strings;

public class StringReplace {
    public static void main(String[] args) {

        String word = "Apple banana strawberry";
        word = word.replace('a','e');
        System.out.println("word a to e= " + word); // Apple benene streberry

        System.out.println(word.replace('e','a'));

        String countries = "Italia Columbia Croatia ";
        System.out.println(countries.replace(" ", " Republic. "));

        //000000000000000000000000000000000000000000000000000000000000000000000000

        //For char '' sigle quotes
        //For strings "" double quotes

        String foods = "hot lentil soup, hot plov, cold kompot, cold ice-cream, warm pasta";
        foods = foods.replace("hot","tasty"); // creates another object in string pool, old one will be deleted
        foods = foods.replace("cold", "cool");
        foods = foods.replace("warm", "hot");
        System.out.println("foods = " + foods);

        String letter = "hello everyone, hope you are doing good, i wish you good luck!";
        letter = letter.replace("b", "a");
        System.out.println("letter = " + letter);

        letter = letter.replace("h", "a");
        letter = letter.replace("e", "a");
        letter = letter.replace("l", "a");
        letter = letter.replace("o", "a");
        letter = letter.replace("v", "a");
        letter = letter.replace("r", "a");
        letter = letter.replace("y", "a");
        letter = letter.replace("n", "a");
        letter = letter.replace("d", "a");
        letter = letter.replace("i", "a");
        letter = letter.replace("w", "a");
        letter = letter.replace("g", "a");
        letter = letter.replace("l", "a");
        letter = letter.replace("k", "a");
        letter = letter.replace("h", "a");










    }
}
