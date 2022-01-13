package Day_16_ForLoopStringPractice;

public class RemoveDublicates {

    public static void main(String[] args) {

        String str = "aabbaacc";
        String results = "";//abc

        for (int i = 0; i <str.length(); i++) {//i:represents the all index number of str(starting from 0)
            char ch = str.charAt(i);//represents each Characters of str
            if (!results.contains(ch + "")) {//if the characters is not contained in the result
                results += ch;//the character will be added to the result
            }
        }
        System.out.println(results);


        //Sttring word="abdccdfa"
        //if word.charAt(i)>='a'&&word.charAt(i)<='z';
        ///

    }
}
