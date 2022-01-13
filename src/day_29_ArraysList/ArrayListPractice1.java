package day_29_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

    public static void main(String[] args) {

        String [] countries ={"Japan","Korea","United States","Turkey","United Kingdom","Canada"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));
        System.out.println(list);

        list.removeIf(n-> n.length()>=10);

        //converting arralist back to array
        countries=list.toArray(new String[0]);

        System.out.println(Arrays.toString(countries));

    }
}
