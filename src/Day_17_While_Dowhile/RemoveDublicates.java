package Day_17_While_Dowhile;

public class RemoveDublicates {

    public static void main(String[] args) {

        String str = "AABBCC";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            String ch = ""+str.charAt(i);
            if (result.contains(ch)){
                continue;//skips
            }
            result+=ch;
        }
        System.out.println(result);
    }
}
