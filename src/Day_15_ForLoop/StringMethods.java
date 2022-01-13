package Day_15_ForLoop;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {
        String str = "  ";
        boolean r=str.isEmpty();
        System.out.println(r);

        boolean r1 = str.isBlank();
        System.out.println(r1);

        String str2="Cydeo";

        System.out.println(str2.isBlank());

        System.out.println("-----------------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("yEs".equalsIgnoreCase("yes"));

        System.out.println("--------------------------------------");

        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");



        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);

        System.out.println("------------------------------");

        String in1 = "I love JaVa";
        String in2 = "Java";
        System.out.println(in1.equalsIgnoreCase(in2));
        System.out.println(in1.equals(in2));

        System.out.println(in1.toLowerCase().contains("java"));
        System.out.println(in1.toUpperCase().contains("JAVA"));

        System.out.println("-------------------------------");

        String a = "Wooden Spoon";

        boolean x= a.startsWith("Woo");
        System.out.println(x);

        boolean y =a.endsWith("Spoon");
        System.out.println(y);

        boolean z =a.toLowerCase().startsWith("wooden");// in order to ignore the case sensivity we first create the lower case version of string and then

    }
}

