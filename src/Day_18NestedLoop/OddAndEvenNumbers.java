package Day_18NestedLoop;

import java.util.Scanner;

public class OddAndEvenNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Enter a nuber:");
            int num = scan.nextInt();

            if (num%2==0){
                System.out.println(num+" is even number");
            }else{
                System.out.println(num+" is odd number");
            }

            System.out.println("would you like to enter another number?");
            String a = scan.next().toLowerCase();

            while(!(a.equals("no")||a.equals("yes"))){
                System.err.println("Please re enter");
                a= scan.next().toLowerCase();
            }
            if (a.equals("no")){
                break;
            }
        }
            scan.close();







    }
}
