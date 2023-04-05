package stringBuilder;

public class IntroToStringBuilder {
    public static void main(String[] args) {

        String name = "Jessica";
        name = "Jessy";
        System.out.println(name);

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("John");
        StringBuilder sb3 = new StringBuilder(20);

        sb2.append(" Galt");
        System.out.println(sb2);

        sb2.append(23);
        sb2.append(true);
        sb2.append(1.23);
        sb2.append(143242379841L);
        System.out.println("sb2 = " + sb2);

        // ------------------------------------

        // .insert(index, " ")
        sb2.insert(0, "G");
        System.out.println("sb2 = " + sb2);

        // -------------------------------

        // .remove
        sb2.replace(0,5, "Tim");
        System.out.println("sb2 = " + sb2);
        sb2.replace(4, 30,"How are you?");
        System.out.println("sb2 = " + sb2);
        sb2.replace(3,4,", ");
        System.out.println("sb2 = " + sb2);
        System.out.println("sb2.length() = " + sb2.length());
        sb2.replace(0,17,"Good, How are you?");
        System.out.println("sb2 = " + sb2);

        // 0000000000000000000000000

        sb2.delete(0,4);
        System.out.println("sb2 = " + sb2);

        System.out.println(sb2.indexOf(","));
        System.out.println("sb2.reverse() = " + sb2.reverse());

        // --------------------------------------------------------

        System.out.println("The length of sb2: " + sb2.length());

        // ---------------------------------------
        System.out.println(sb2.indexOf("How are"));
        System.out.println(sb2.reverse());
        System.out.println(sb2);

        // ---------------------
        System.out.println(sb2.substring(sb2.indexOf("How"), sb2.indexOf("?")));

        //-----------------------------------------




    }
}
