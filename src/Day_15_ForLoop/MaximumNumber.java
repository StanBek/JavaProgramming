package Day_15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int max=-2147483648;//max1+1=2,max2+1=3;max=3;

        for (int i = 1; i < 6; i++) {
            System.out.println("Enter your numbers:");
            int num=s.nextInt();//1,2,3/1/5

            if(num>max){
                max=num;
            }
        }
        System.out.println(max);
    }
}
/*
Ask the user to enter a number for 5 times.
return to maximum number
 */