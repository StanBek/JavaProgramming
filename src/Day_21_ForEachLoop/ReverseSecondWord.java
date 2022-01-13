package Day_21_ForEachLoop;

import java.util.Arrays;

public class ReverseSecondWord {

    public static void main(String[] args) {

        String sentence = "I Love Java";

        String []word = sentence.split(" ");//[i,love,java]

        String reverse = "";

        for (int i = word[1].length()-1; i >=0 ; i--) {
            reverse += word[1].charAt(i);
        }
        System.out.println(reverse);
        System.out.println("----------------------");
       // sentence=sentence.replaceFirst(word[1],reverse);
        word[1]=reverse;
        System.out.println(Arrays.toString(word));

        System.out.println("-----------------------------");

        String result="";
        for(String each:word){
            result+=each+" ";
        }
        System.out.println(result);

    }
}
