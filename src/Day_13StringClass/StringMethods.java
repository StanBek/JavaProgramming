package Day_13StringClass;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {

        String word = "Cydeo";
        char thirdChar = word.charAt(2);
        System.out.println("thirdchar " + thirdChar );

        char tenthChar = word.charAt(4);

        System.out.println("tenthChar "+tenthChar);

        System.out.println("---------------------------");

        String s1 = "Batch 25 is the best batch. Java programming";
        int totalChars= s1.length();

        System.out.println("Total Chars:" + totalChars);

        char LastChar = s1.charAt(s1.length()-1);
        System.out.println(LastChar);

        System.out.println("---------------------------------------");

        String str = "wooden spoon";
        str = str.toUpperCase();//"WOODEN SPOON";
        System.out.println(str);

        String sentence = "Today is a great day to Learn Java programming Language";
        sentence=sentence.toUpperCase();
        System.out.println(sentence);

    }
}
