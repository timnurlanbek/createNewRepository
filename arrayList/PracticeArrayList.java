package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Sofi");
        names.add("Tim");
        names.add("Ali");
        names.add("Mirlan"  );
        names.add("Eshmat");

        System.out.println(names);

        names.remove("Eshmat");
        System.out.println(names);
        names.remove("Mirlan");
        System.out.println(names);

        names.add("another richer man");
        names.add("another more positive man");
        names.add("another more clever man");
        System.out.println(names);
        System.out.println(names.size());

        names.clear();
        System.out.println(names);

        // -----------------------------------------------------------

        ArrayList <String> skills = new ArrayList<>();

        String [] names2 = {"Temirbek", "Tim", "Steven", "Micheal"};
        System.out.println(Arrays.toString(names2));
        System.out.println(names2.length);

        List<String> arrayOfNames2 = Arrays.asList(names2);
        System.out.println(arrayOfNames2);

        // ---------------------------------------------------

        ArrayList <Integer> integers = new ArrayList <>();

        integers.add(1);
        integers.add(2);
        integers.add(3);
        System.out.println(integers);

        int [] integers2 = {4,5,6};


    }
}
