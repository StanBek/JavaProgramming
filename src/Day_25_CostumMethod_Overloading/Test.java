package Day_25_CostumMethod_Overloading;
import Utilities.StringUtility;

public class Test {

    public static void main(String[] args) {
        String str = "Java Programming Language";
       StringUtility.printEachChar(str);

        System.out.println("-------------------");
        String s1="Wooden spoon";
        String reverse=StringUtility.reverse(s1);
        System.out.println(reverse);

        System.out.println("-----------------------");

        String s2="Levar";
        boolean palindrome=StringUtility.isPalindrome(s2);
        System.out.println(palindrome);

        System.out.println("-------------------------------");

        String [] names = {"Anna","Java","Python","racecar","Mom","Cydeo"};
        int count=0;
        for (String each:names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println(count);

        System.out.println("-----------------------------------");
        String str1="abc";
        String str2="bca";
        boolean anogram=StringUtility.anagram(str1,str2);
        System.out.println(anogram);

        System.out.println("---------------------------------------");
        String s3 = "aaaaannnbbbbcccgdttt";
        String nonedub=StringUtility.removeDublicate(s3);
        System.out.println(nonedub);

    }
}
