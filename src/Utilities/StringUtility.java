package Utilities;

import java.util.Arrays;

public class StringUtility {
//prints each character of the given string
    public static void printEachChar(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
    }
}

//reverse the given string and returns the reversed string
    public static String reverse(String str){
        String reverse="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);
        }
        return reverse;
    }
//checks if the given string is palindrome, return boolean
    public static boolean isPalindrome(String str){
        String reverse="";
        return reverse(str).equalsIgnoreCase(str);

    }

//checks if the given string ia anagram, reruns boolean
    public static boolean anagram(String str1, String str2){
        char[]ch1=str1.toCharArray();
        char[]ch2=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }

    //removes the dublicates from given string, return string."aaaaabbbbccc"==>"abc"

    public static String removeDublicate(String str){
        String result ="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(!result.contains(""+ch)){
                result+=ch;
            }
        }
        return result;
    }

    }


