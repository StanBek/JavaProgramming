package Day_18NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true){

            System.out.println("enter your age:");
            int age = scan.nextInt();

            while (!(age>=18&&age<=120)){
                System.err.println("Invalid enter, please reenter your age:");
                age= scan.nextInt();
            }
            System.out.println("Would you like to continue?");
            String a= scan.next().toLowerCase();

            while(!(a.equals("no")||a.equals("yes"))){
                System.out.println("Invalid enter, please reenter, would you like to continue?");
            }

            if(a.equals("no")){
                break;
            }

        }







    }
}
