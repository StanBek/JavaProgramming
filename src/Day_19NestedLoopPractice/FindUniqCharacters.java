package Day_19NestedLoopPractice;

public class FindUniqCharacters {

    public static void main(String[] args) {

        String str = "aabccdeef";
        String result="";//bdf

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count =0;//represent the frequency of the ch

            for (int i = 0; i < str.length(); i++) {
                char each =str.charAt(i);// each characters of str
                if(ch==each){
                    count++;
                }
            }
            if (count==1){//if the frequency of character is 1, then the character is unique
                //count!=1
                //continue;
                result+=ch;
            }
        }


        System.out.println(result);

    }
}
