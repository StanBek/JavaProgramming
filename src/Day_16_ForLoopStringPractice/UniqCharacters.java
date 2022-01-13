package Day_16_ForLoopStringPractice;

import java.util.Locale;

public class UniqCharacters {

    public static void main(String[] args) {
        String word = "AABBCCDb";
        String result="";
        for (int i = 0; i < word.length(); i++) {//i:index numbers of word starting from 0
            char ch = word.charAt(i);//each characters of word
            if(word.indexOf(ch)==word.lastIndexOf(ch)){// if the first and last index are same and then character are same
                result+=ch;
            }

        }
        System.out.println(result);







    }
}
