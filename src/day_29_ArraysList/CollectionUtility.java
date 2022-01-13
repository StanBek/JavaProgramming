package day_29_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionUtility {

    public static void main(String []args){

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));

        Collections.sort(list);
        System.out.println(list);

        System.out.println("================================");

        ArrayList<Character> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList('A','B','C','D','E'));
        System.out.println(list2);

        Collections.reverse(list2);
        System.out.println(list2);

        System.out.println("================================");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,50,60));
        Collections.swap(list3, 1,4);
        System.out.println(list3);
        System.out.println("==================================");
        
        int max = Collections.max(list3);
        int min = Collections.min(list3);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("====================================");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java","Phyton","JavaScript","C#","C++","Java"));

        int countJava = Collections.frequency(words,"Java");
        int countPhyton = Collections.frequency(words,"Phyton");


    }
}
