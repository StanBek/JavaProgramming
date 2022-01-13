package practice_12_01_21;

public class Palindrome {

    public static void main(String[] args) {
        /*
         Write a program that can check if the given String is palindrome

           Ex:
           input:
           Level

           output:
           true

           input:
           Anna

           output:
           true
         */

        String name = "Level";
        String reverse="";
        for (int i = name.length()-1; i >=0 ; i--) {
            reverse+=name.charAt(i);

        }
        System.out.println(reverse);
        boolean isPalindrome = name.equalsIgnoreCase(reverse);
        System.out.println(isPalindrome);
    }
}
