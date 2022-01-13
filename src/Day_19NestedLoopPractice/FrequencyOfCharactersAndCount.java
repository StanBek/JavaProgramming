package Day_19NestedLoopPractice;

public class FrequencyOfCharactersAndCount {

    public static void main(String[] args) {

        String str = "aabcccd";
        String result = ""; //output a2b1c3d1

        for (int j = 0; j < str.length(); j++) {//each characters from string
            char ch = str.charAt(j);//'a'
            int count = 0;

            for (int i = 0; i < str.length(); i++) {//to find the frequency of each charactres
                char each = str.charAt(i);//representing each characters of str
                if (ch == each) {
                    count++;
                }
            }
            if (result.contains(ch + "")) {
                continue;
            }
            result += ch;
            result += count;
        }
        System.out.println(result);
    }
}