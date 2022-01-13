package practice_12_01_21;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("How many Fibonaci numbers do you want to see:");
        int number = s.nextInt();
        int num1 = 0;
        int num2=1;
        int result =0;



        for (int i = 0; i < number; i++) {
            result=num1+num2;
            num1=num2;
            num2=result;
            System.out.println(result);

        }
    }
}
/*
Fibonacci is a sequence of number starting from 
0, 1 where the following numbers are the sum of the previous 2 numbers

Note: Fibonacci numbers are read as index values,
 so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc

 Ex:
 Input:
 8
 Output:
  0, 1, 1, 2, 3, 5, 8, 13, 21
 */