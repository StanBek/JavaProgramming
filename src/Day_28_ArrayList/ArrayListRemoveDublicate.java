package Day_28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveDublicate {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {
            if(result.contains(each)){
                continue;
            }

            result.add(each);
        }

        System.out.println(result);

        System.out.println("===================================");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1==list2);
        System.out.println(list1.equals(list2));

        System.out.println("================================");

        ArrayList<Integer> num = new ArrayList<>();
        //Bulk Operation:CollectionType
        num.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println(num);




    }
}
