package Day_28_ArrayList;

import java.util.ArrayList;

public class ArrayListRemoveAll {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.clear();
        System.out.println(list.size());
        System.out.println(list);

        System.out.println("=================================");

        ArrayList<Character> characters=new ArrayList<>();

        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('B');

        int a=characters.indexOf('A');
        int b=characters.lastIndexOf('B');//4

        System.out.println(a);
        System.out.println(b);

    }
}
