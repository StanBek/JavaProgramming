package day_29_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("Ali","David","Ahmed","Jimmy","Daniel","Aaron","Ahmed","David","Shay"));

        employees.retainAll(Arrays.asList("Ahmed","David"));
        System.out.println(employees);
        System.out.println("=============================================");

        String[] names = {"Mary","Monica","Mehray","Stan","Sumeyra","Hasan","Beril"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        list.removeIf(n-> n.charAt(0)=='M');
        System.out.println(list);

        names=list.toArray(new String[0]);
        System.out.println(Arrays.toString(names));
    }
}
