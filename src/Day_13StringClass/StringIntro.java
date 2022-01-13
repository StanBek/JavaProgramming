package Day_13StringClass;

import javax.crypto.spec.PSource;

public class StringIntro {

    public static void main(String[] args) {
        String name = "Wooden Spoon";
        //Stack  //Heap
        String name2 = "Wooden Spoon";
        String name3 = "Wooden Spoon";

        System.out.println(name==name2);//true
        System.out.println(name2==name3);//true

        System.out.println("---------------------------");

        String str1 = new String("Wooden spoon");
        String str2 = new String("Wooden spoon");

        System.out.println(str1==str2);// false

        System.out.println("---------------------------------------");

        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println(s1.equals(s2));

        String s3 = "Java";
        String s4 = new String("java");
        System.out.println(s3.equals(s4));

    }



}
