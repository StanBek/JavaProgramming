package practice_01_05_22;

import java.util.Arrays;

public class RemoveSpace {
    public static void main(String[] args) {
        String input ="Hello world      I      love      Java";

        removeSpace(input);
    }

    public static void removeSpace(String str){
        String result="";
        String[]strArr=str.trim().split(" ");
        //System.out.println(Arrays.toString(strArr));

        for(String each:strArr){
            if(!each.isEmpty())
                result+=each+" ";
        }
        System.out.println(result);
    }
}
