package Day_17_While_Dowhile;

public class FrequenceOfCharacters {

    public static void main(String[] args) {

        String str = "AAABBBC";
        char ch = 'A';
        int frequency = 'A';

        for (int i = 0; i < str.length(); i++) {

            char eachChar = str.charAt(i); //eachChar: each characters of str

            if (ch == eachChar) {//if given ch is matching with the characters

                frequency++;
            }
            System.out.println(frequency);
        }
    }
}
