package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DuplicatesCollection {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(Arrays.asList("A", "B","A", "C", "D","D"));

        ArrayList<String> result = new ArrayList<>();

        for (int i=0; i<list.size(); i++) {
            int count = Collections.frequency(list, list.get(i));
            if (count > 1&&!result.contains(list.get(i))) {
                result.add(list.get(i));
            }
        }
        System.out.println(result);




    }
}
