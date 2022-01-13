package Day_17_While_Dowhile;

import java.util.Locale;
import java.util.Scanner;

public class WillYouMarryMe {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Will you mary me? Yes/No");
        String answer = scan.next().toLowerCase();


        while (!(answer.equals("yes")||answer.equals("no"))){
            System.out.println("invalid answer please re-enter");
            answer=scan.next().toLowerCase();
        }
        if(answer.equals("yes")){
            System.out.println("Congrats");
        }else{
            System.out.println("Goodbye");
        }


        //System.out.println((answer.equals("Yes")?"Congrats":"I'm so sory"));
                         //answer.toLowerCase();



    }
}
