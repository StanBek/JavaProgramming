package day_29_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElement {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));

        ArrayList<Integer> uniq = new ArrayList<>();
        for (Integer each : list) {
            int frequency=Collections.frequency(list,each);
            if(frequency==1){
                uniq.add(each);
            }
        }
        System.out.println(uniq);


        System.out.println("========================================");


        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));

        ArrayList<Integer> uniq2 = new ArrayList<>(list2);
         uniq2.removeIf(n-> Collections.frequency(list2,n)>1);

        System.out.println("uniq2 = " + uniq2);
        
    }
}
