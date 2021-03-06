package day_29_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqCharacters {

    public static void main(String[] args) {
        
        String str = "aaabcccdeeef";

        String[] arr=str.split("");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println("list = " + list);
        
        String unique = "";

        for (String each : list) {
            int frequency=Collections.frequency(list, each);
            if(frequency==1){
                unique+=each;
            }
        }
        System.out.println("unique = " + unique);
    }
}
