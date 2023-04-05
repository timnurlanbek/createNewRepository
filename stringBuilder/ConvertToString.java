package stringBuilder;

public class ConvertToString {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Temirbek");

        String name = sb1.toString();
        System.out.println("name = " + name);
        // ---------------------------

        reversedString("Temirbek");
        reversedString2("Elturan");
    }

    public static String reversedString (String word){
        StringBuilder sb1 = new StringBuilder(word);
        sb1.reverse();
        String reversedString = sb1.toString();
        System.out.println("Reversed version of " + word + " is: " + reversedString);
        return reversedString;
    }

    public static String reversedString2 (String word){
        String newString = "";
        for (int i = word.length()-1; i >= word.charAt(0); i--) {
            newString = newString + word.charAt(i);
        }
        System.out.println("Reversed version of " + word + " is: " + newString);

        return newString;
    }



}
