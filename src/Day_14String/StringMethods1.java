package Day_14String;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1 = " batch   25  ";
        str1.trim();
        System.out.println(str1);

        String str2 = "Cydeo school";
        str2.indexOf("h");
        int n1 = str2.indexOf("h");
        System.out.println(n1);

        int n2 = str2.indexOf("ool");
        System.out.println(n2);

        String str3 = "Java Programming Language";
        int n3 = str3.indexOf("amm");
        System.out.println(n3);


    }
}
