package Day_20_Arrays;

import java.util.Scanner;

public class ars {
    public static String clean (String text , String badWord) {

        String [] args= {text};
        String result="";
        for(String each:args){
            if(each.equals(badWord)){
                continue;
            }
            result+=each+"";
        }

        return result;



    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(clean(in.nextLine(), in.nextLine()));
    }

}
