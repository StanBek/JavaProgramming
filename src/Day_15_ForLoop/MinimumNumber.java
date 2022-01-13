package Day_15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int min = 2147483647;

        for (int i = 1; i < 6; i++) {
            System.out.println("Enter your numbers:");
            int num = s.nextInt();//1,2,3/1/5
            if(num<min)
                min=num;
        }
        System.out.println("min: "+min);

        }

    }










/*
Ask the usr to enter a number for 5 times. return to minimum number
 */