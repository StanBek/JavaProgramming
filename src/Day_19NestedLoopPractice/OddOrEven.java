package Day_19NestedLoopPractice;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Enter a number:");

            int num = s.nextInt();

            if (num%2==0){
                System.out.println("Even number");
            }else{
                System.out.println("Odd number");
            }

            System.out.println("Would you like to enter another number?(yes/no)");
            String a = s.next();

            if(!(a.equalsIgnoreCase("no")||a.equalsIgnoreCase("yes"))){
                System.err.println("Invalid enter");
                System.exit(0);
            }

            if (a.equalsIgnoreCase("no")){
                System.out.println("Thank you");
                break;
            }
        }





    }
}
