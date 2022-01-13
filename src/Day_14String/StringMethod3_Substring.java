package Day_14String;

public class StringMethod3_Substring {

    public static void main(String[] args) {
        //substring(beginning index, ending index)

        String word = "Cydeo School";
        //             0123456789010
        String brand = word.substring(0, word.indexOf(" "));
        System.out.println(brand);

        String str=word.substring(6);
        System.out.println(str);

        String word2 = "Java Programming Language";
        String s1 = word2.substring(0,word.indexOf(" "));
        System.out.println(s1);
        String s2 = word2.substring(word2.indexOf(" ")+1,word2.lastIndexOf(" "));
        System.out.println(s2);
        String s3 = word2.substring(word2.lastIndexOf(" ")+1);
        System.out.println(s3);
    }
}
