package day_29_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));
        int num=3;
        for (int i = 1; i < num; i++) {
            list.removeIf(n-> Collections.max(list)==n);
        }
        int max = Collections.max(list);
        System.out.println(max);

    }

}
