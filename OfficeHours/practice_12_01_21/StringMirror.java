package practice_12_01_21;

public class StringMirror {

    public static void main(String[] args) {

        String str="abZYuZba";

        String result="";

        int len=str.length(); // Length of given String
        for (int i = 0; i < len; i++) {
            if (str.charAt(i)==str.charAt(str.length()-1-i)){
                result += str.charAt(i);
            } else break;
        }
        System.out.println(result);
    }
}
/*
Given a string, look for a mirror image (backwards) string at
both the beginning and end of the given string.
 In other words, zero or more characters at the very
  begining of the given string, and at the very end of the
           string in reverse order (possibly overlapping).
           For example, the string "abXYZba" has the mirror end "ab".

                  mirrorEnds("abXYZba") → "ab"
                  mirrorEnds("abca") → "a"
                  mirrorEnds("aba") → "aba"
 */