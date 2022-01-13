package Day_21_ForEachLoop;

import java.util.Arrays;

public class ReverseSentence {

    public static void main(String[] args) {

        String sentence = "Today is a good day to learn Java";

        String []word = sentence.split(" ");

        System.out.println(Arrays.toString(word));

        String reverseSentence="";//Java learn to day good a is Today

        for (int i = word.length - 1; i >= 0; i--) {
            reverseSentence+=word[i]+" ";

        }

        System.out.println(reverseSentence);

    }
}
