package practice_12_01_21;

import java.util.Scanner;

public class StringTimes {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter any word");
        String word = s.next();
        System.out.println("Enter any possitive number");
        int num=s.nextInt();
        String sum="";
        /*int count = 0;
        while(count<num){
            sum+=word;
            count++;
            ....

        }
        ....
         */
        for(int i=0; i<num; i++){
            sum+=word;
        }
        System.out.println(sum);
    }
}
