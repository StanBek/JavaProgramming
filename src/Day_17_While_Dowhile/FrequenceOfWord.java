package Day_17_While_Dowhile;

public class FrequenceOfWord {

    public static void main(String[] args) {

        String word = "JavaJavaJavaBavaMavaJava";
        String str = "Java";
        int result = 0;

        for (int i = 0; i <= word.length()-4; i++) {
            String eachSub = word.substring(i, i+4);

            if (eachSub.equalsIgnoreCase(str)){
                result++;
            }
        }
        System.out.println(result);
    }
}
