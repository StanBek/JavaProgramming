package Day_15_ForLoop;

import java.util.Scanner;

public class MultipleNumbers {
    public static void main(String[] args) {

        int sum = 2;
        for (int i = 1; i <101 ; i++) {
            sum+=i;
            System.out.println(sum);
        }

        System.out.println();
        System.out.println("-----------------------");
        int total = 0;
        Scanner s= new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.println("Enter a number:");
            total+=s.nextInt();
        }
        System.out.println("total= "+total);
        s.close();


















    }
}
