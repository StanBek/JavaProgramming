package Day_16_ForLoopStringPractice;

public class test {
    public static void main(String[] args) {
        String word="adbadafa";
        String result="";
        int count=0;
        for (int i = 0; i < word.length(); i++) {

            char ch=word.charAt(i);
            if ( ch>= 0&&ch<='a'&&ch>='z') {
                result += word.charAt(i);
                count++;
            }
        }
            System.out.println(result+count);
        }

    }
