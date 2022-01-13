package day_29_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7};
        //{7,6,5,4,3,2,1}

        int[]reverse = new int [array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--,j++) {
            reverse[j]=array[i];
        }

        System.out.println(Arrays.toString(reverse));

        System.out.println("================================");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7));
        ArrayList<Integer> reverseList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            int each = list.get(i);
            reverseList.add(each);
        }
        System.out.println(reverseList);
    }
}
