package Day_14String;

public class StringMethods2 {

    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Python");
        System.out.println(str);
        System.out.println(str2);

        String email = "StanBek@yahoo.com";
        email = email.replace("yahoo", "gmail");
        System.out.println(email);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python";
        String sentence2 = sentence.replace("Python", "");
        String s3 = sentence2.replace("   ", "");

        System.out.println(s3);

        String s = "Dog Dog Dog Dog Dog";
        String s1= s.replace("Dog","Cat");
        System.out.println(s1);

        String result1 = "Java";
        result1 = result1.replaceFirst("va","vo");
        System.out.println(result1);
    }
}
