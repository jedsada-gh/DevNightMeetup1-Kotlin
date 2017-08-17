import java.util.*;

public class Collections {

    public static void main(String[] args) {

        // Java
        List<String> listFruits = Arrays.asList("apple", "coconut",
                "mango", "avocado");
        listFruits.add("cherry");

        for (int i = 0; i < listFruits.size(); i++) {
            String result = String.format("%s at %d",
                    listFruits.get(i), i);
            System.out.println(result);
        }

        for (String value : listFruits) {
            System.out.println(value);
        }

        listFruits.forEach(System.out::println);

        List<String> filterFruits = new ArrayList<>();

        for (int i = 0; i < listFruits.size(); i++) {
            if (listFruits.get(i).startsWith("a")) {
                filterFruits.add(listFruits.get(i));
            }
        }

        System.out.println(filterFruits.toString());
        // output -> [apple, avocado]


    }


}
